<template>
  <div class="user-record">
    <div class="user-record-head">
      <div class="user-record-head-title">
        <span>订阅</span>
      </div>
      <div class="user-record-head-title" style="margin-left: 2%">
        <span>听过</span>
      </div>
      <div class="user-record-head-title" style="margin-left: 2%">
        <span>已购</span>
      </div>
      <div class="user-record-head-title" style="margin-left: 2%">
        <span>喜欢</span>
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
.user-record{
  width: 45%;
  height: auto;
  min-height: 400px;
  margin-left: 20%;
  background-color: #f4e9ea;
}
.user-record-head{
  width: 100%;
  height: 60px;
  background-color: #ffffff;
}
.user-record-head-title{
  height: 60px;
  text-align: center;
  font-size: 20px;
  line-height: 60px;
  width: 10%;
  float: left;
}
.user-record-head-title:hover{
  color: #8c222c;
  font-size: 22px;
  cursor: pointer;
  border-bottom: 3px solid #8c222c;
}
</style>