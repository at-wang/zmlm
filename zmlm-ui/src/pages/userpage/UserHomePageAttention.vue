<template>
  <div style="height: 20px;width: 70%;margin-top: 50px;position: absolute">
    <div style="margin-top: 30px;width: 60%">
      <span style="font-size: 13px;color: #40404c">我共关注了多少人</span>
      <el-divider/>
    </div>
    <template v-for="data of 10">
      <div style="margin-top: 20px;width: 60%;height: 100px;border-bottom: 1px solid #e8e8e8">
        <div style="width: 10%;height: 100px;float: left">
          <el-avatar style="transition: 1s;margin-left: 10px;cursor: pointer;margin-top: 22px"  :size="60" src="https://profile.csdnimg.cn/9/3/A/0_weixin_60566467" />
        </div>
        <div style="width: 61%;height: 100px;float: left;margin-left: 20px;margin-top: 15px">
          <div style="color: #40404c;font-size: 14px">喜马拉雅</div>
          <div style="font-size: 14px;margin-top: 30px;color: #a3a3ac">
            <span>627</span>
            <span style="margin-left: 30px">627</span>
            <span style="margin-left: 30px">627</span>
            <span style="margin-left: 30px">627亿</span>
          </div>
        </div>
        <div style="width: 20%;height: 100px;float: left;margin-left: 20px;margin-top: 15px">
          <template v-if="true">
            <el-button style="width: 100px;margin-top: 15px;border: 1px solid #8c222c">关注</el-button>
          </template>

          <template v-if="false">
            <el-button style="width: 100px;margin-top: 15px;">已关注</el-button>
          </template>
        </div>
      </div>
    </template>
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