<template>

  <div style="margin-top: 5%">
    <div>
      共购买过？张专辑
    </div>
    <el-divider />
    <div style="width: 100%;background-color: #1baeae" v-for="data of 10">
      <div style="width: 20%;float: left;cursor: pointer">
        <img alt="图片" style="width: 85%;border-radius: 10px" src="https://imagev2.xmcdn.com/storages/772d-audiofreehighqps/64/C6/GKwRIDoHLB6WAAckzgG4fIQU.jpeg!strip=1&quality=7&magick=webp&op_type=3&columns=290&rows=290">
        <div style="width: 90%">
          <div style="width: 30px;height:20px;background-color: #85c539;font-size: 10px;color: white;float: left;text-align: center;line-height: 20px">
            完本
          </div>
          <span class="user-record-subscribe-span">测试曾打大大大大大算大苏打实打实</span>
        </div>
        <div  style="width: 85%;float: left">
          <span style="font-size: 12px;color: #a3a3ac;float: left;width: 60%">共100集</span>
        </div>
      </div>
    </div>
  </div>


</template>

<script  setup>
import {onMounted, reactive} from "vue";


const state =reactive({

})
const test = (e) => {

}
onMounted(()=>{

})
</script>

<style scoped>
.user-record-subscribe-span{
  font-size: 12px;
  margin-left: 3px;
}

.user-record-subscribe-span:hover{
  color: #8c222c;
}
</style>
