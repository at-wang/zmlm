<template>
  <div style="width: 50%;height: 500px;border: 1px solid #dcdfe6;overflow: auto">
    <template v-for="item in state.user">
      <template v-if="item.fromUserId===state.userId">
        <div class="user-to-message">
          {{ item.content }}
        </div>
      </template>


      <template  v-if="item.fromUserId!==state.userId">
        <div class="user-from-message" >
          {{ item.content }}
        </div>
      </template>
    </template>
  </div>
  <el-input
      type="textarea"
      placeholder="请输入内容"
      v-model="state.text"
      maxlength="300"
      style="width: 50%"
      :autosize="{minRows: 6, maxRows: 6}"
      show-word-limit
      @keyup.enter.native="websocketsend"
  >
  </el-input>
</template>

<script setup>
import {onMounted, reactive, useAttrs, useSlots} from "vue";


const state = reactive({
  user: [
    /*{articleid: 'user1', content: '13213213333333333333333333333333333333333sssssssssssssss33333333333333333333', date: new Date("2022-02-02")},
    {articleid: 'user1', content: '2', date: new Date("2022-03-02")},
    {articleid: 'user2', content: '3', date: new Date("2022-03-03")},
    {articleid: 'user1', content: '4', date: new Date("2022-04-02")},
    {articleid: 'user2', content: '5', date: new Date("2022-05-01")},
    {articleid: 'user1', content: '6', date: new Date("2022-05-02")},
    {articleid: 'user1', content: '6', date: new Date("2022-05-02")},
    {articleid: 'user1', content: '6', date: new Date("2022-05-02")},
    {articleid: 'user1', content: '6', date: new Date("2022-05-02")},
    {articleid: 'user1', content: '6', date: new Date("2022-05-02")},
    {articleid: 'user1', content: '6', date: new Date("2022-05-02")},
    {articleid: 'user1', content: '6', date: new Date("2022-05-02")},
    {articleid: 'user1', content: '6', date: new Date("2022-05-02")},
    {articleid: 'user1', content: '6', date: new Date("2022-05-02")},
    {articleid: 'user1', content: '6', date: new Date("2022-05-02")},
    {articleid: 'user1', content: '6', date: new Date("2022-05-02")},
    {articleid: 'user1', content: '6', date: new Date("2022-05-02")},
    {articleid: 'user1', content: '6', date: new Date("2022-05-02")},
    {articleid: 'user1', content: '6', date: new Date("2022-05-02")},
    {articleid: 'user1', content: '6', date: new Date("2022-05-02")},
    {articleid: 'user1', content: '6', date: new Date("2022-05-02")},
    {articleid: 'user1', content: '6', date: new Date("2022-05-02")},
    {articleid: 'user1', content: '6', date: new Date("2022-05-02")},
    {articleid: 'user1', content: '6', date: new Date("2022-05-02")},
    {articleid: 'user1', content: '6', date: new Date("2022-05-02")},
    {articleid: 'user1', content: '6', date: new Date("2022-05-02")},
    {articleid: 'user1', content: '6', date: new Date("2022-05-02")},*/
  ],
  text: 'd',
  userId:""

})

let wb=null
const test = (e) => {
  console.log(state.text)
  state.text = ""
}
const websocketonopen = (e) => {
  console.log(state.text)
  state.text = ""
}
const websocketsend = (e) => {
  let data;
  if (sessionStorage.getItem("userId")==="1"){
     data={
      fromUserId:"1",
      toUserId:"2",
      content:state.text,
    }
  }else {
     data={
      fromUserId:"2",
      toUserId:"1",
      content:state.text,
    }
  }
  state.user.push(data)
  wb.send(JSON.stringify(data))
  state.text=""
}
const websocketonerror = (e) => {
  console.log(state.text)
  state.text = ""
}
const websocketonmessage = (e) => {
  console.log(e)
  console.log(JSON.parse(e.data))
  state.user.push(JSON.parse(e.data))
}
const test2 = (e) => {
  wb = new WebSocket("ws://127.0.0.1:8082/message/websocket/" + state.userId);
  wb.onopen = websocketonopen;
  wb.onerror = websocketonerror;
  wb.onmessage = websocketonmessage;
}
const test3 = (e) => {
  console.log(state.text)
  state.text = ""
}
const test4 = (e) => {
  console.log(state.text)
  state.text = ""
}
onMounted(() => {
  state.userId=sessionStorage.getItem("userId")
  test2()
})
</script>

<style scoped>
.user-from-message {
  /*border: 1px solid chartreuse;*/
  padding: 10px;
  min-width: 30px;
  margin-left: 20px;
  background-color: #f6f7f8;
  width: auto;
  max-width: 40%;
  min-height: 30px;
  margin-top: 30px;
  word-wrap: break-word;
  word-break: break-all;
  height: auto;
  clear: both;
  float: left;
  border-radius: 6px
}

.user-to-message {
  /*border: 1px solid royalblue;*/
  padding: 10px;
  background-color: #ffd983;
  width: auto;
  max-width: 40%;
  min-width: 30px;
  min-height: 30px;
  margin-top: 30px;
  word-wrap: break-word;
  word-break: break-all;
  height: auto;
  clear: both;
  float: right;
  border-radius: 4px
}

</style>e