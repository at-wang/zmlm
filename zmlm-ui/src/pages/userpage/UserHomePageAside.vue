<template>
  <div style="width: 340px;height: 100px;margin-left:55%;padding-top: 70px;position:relative;">
    <div style="margin-left: 10px;height: 35px;border-bottom: 1px solid #efefef;">我的资料</div>
    <div style="margin-left: 20px;height: 30px;font-size: 13px;color: #40404c">人字拖</div>
    <div style="margin-left: 20px;height: 30px;font-size: 13px;color: #40404c">1</div>
    <div style="margin-top: 30px;margin-left: 10px;height: 35px;border-bottom: 1px solid #efefef;">我的关注</div>
    <div style="width: 300px;float: left;margin-top: 20px">
      <template  v-for="data of 10">
        <el-avatar class="avatar2" style="transition: 1s;margin-left: 10px;cursor: pointer"  :size="60" src="https://profile.csdnimg.cn/9/3/A/0_weixin_60566467" />
      </template>
    </div>
    <div style="margin-top: 30px;margin-left: 10px;height: 35px;border-bottom: 1px solid #efefef;float: left">我的粉丝</div>
    <div style="width: 300px;float: left;margin-top: 20px">
      <template  v-for="data of 10">
        <el-avatar class="avatar2" style="transition: 1s;margin-left: 10px;cursor: pointer"  :size="60" src="https://profile.csdnimg.cn/9/3/A/0_weixin_60566467" />
      </template>
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

<style >
.avatar2:hover{
  transition: 1s;/* 定义旋转过渡时间 */
  transform:rotate(180deg);/* 定义旋转的角度 */
  /* 下面是兼容处理 */
  -ms-transform:rotate(180deg); /* IE 9 */
  cursor: pointer;
  /*  -moz-transform:rotate(-180deg); !* Firefox *!
    -webkit-transform:rotate(-180deg); !* Safari and Chrome *!
    -o-transform:rotate(-180deg); !* Opera *!*/
}
</style>