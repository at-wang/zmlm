<template>
<div style="position: absolute;margin-top: 50px;width: 70%">
 <div style="margin-top: 30px;width: 60%">
   <span style="font-size: 15px">我的订阅(11)</span>
   <el-link :underline="false" style="font-size: 15px;float: right">全部</el-link>
 </div>
  <div style="width: 62%;margin-top: 20px" v-for="data of 10">
    <div style="width: 20%;float: left;cursor: pointer">
      <img alt="图片" style="width: 85%;border-radius: 10px" src="https://imagev2.xmcdn.com/group68/M05/0D/34/wKgMeF3Hz2zRhGOEAB1MNkVfiag174.bmp!magick=webp">
      <div style="width: 90%">
        <div style="width: 30px;height:20px;background-color: #85c539;font-size: 10px;color: white;float: left;text-align: center;line-height: 20px">
          完本
        </div>
        <span style="font-size: 15px">测试曾打</span>
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

</style>