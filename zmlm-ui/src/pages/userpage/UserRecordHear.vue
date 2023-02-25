<template>
  <el-timeline style="margin-top: 40px">
    <el-timeline-item v-for="data of 10" type="primary" timestamp="今天" placement="top">
      <div class="user-record-hear-card" >
        <!--左边-->
        <div class="user-record-hear-card-left" >
          <div class="user-record-hear-card-img">
            <el-avatar style="margin-top: 15%;margin-left: 15%" :size="70"
                       src="https://profile.csdnimg.cn/9/3/A/0_weixin_60566467"/>
          </div>
        </div>
        <!--右边-->
        <div class="user-record-hear-card-right" >
          <div style="height: 40px;padding-top: 20px">
<!--            <span style="font-size: 15px;float: left;" class="right-span">第35集 里筷子</span>-->
            <span  class="right-span">第35集 里筷子</span>
            <span  class="right-span2">6小时前</span>
<!--            <span style="font-size: 10px;float: right;margin-right: 20%;color: #a3a3ac" class="right-span2">6小时前</span>-->
          </div>
          <div style="height: 40px">
<!--            <span style="font-size: 13px;float: left;color: #72727b" class="right-span3">13路末班车I又名惊魂夜车|惊悚恐怖灵异悬疑|精品探案力作|有声剧</span>-->
            <span  class="right-span3">13路末班车I又名惊魂夜车|惊悚恐怖灵异悬疑|精品探案力作|有声剧</span>
          </div>
          <div style="height: 40px">
<!--            <span style="font-size: 13px;float: left;color: #a3a3ac" class="right-span4">也推磨先生</span>-->
            <span class="right-span4">也推磨先生</span>
            <span style="font-size: 13px;float: left;color: #a3a3ac;margin-left: 10%">20:17</span>
            <el-button size="small" style="float: left;margin-left: 20%" v-show="!state.buttonWhetherShow" >删除</el-button>
          </div>
        </div>
      </div>
    </el-timeline-item>
  </el-timeline>

</template>

<script setup>
import {onMounted, reactive} from "vue";


const state = reactive({
  buttonWhetherShow:false
})
const test = (e) => {

}
onMounted(() => {

})
</script>

<style scoped>
.user-record-hear-card {
  width: 100%;
  height: 140px;
  background-color: #1baeae;
  cursor: pointer;
}

.user-record-hear-card-left {
  float: left;
  width: 18%;
  height: 140px;

  position: relative;
}

.user-record-hear-card-right {
  width: 100%;
  height: 140px;
  background-color: #ffffff;

}

.user-record-hear-card-img {
  position: absolute;
  width: 100px;
  height: 100px;
  background-color: #3f3f3f;
  border-radius: 50%;
  margin: auto;
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
}

.right-span:hover {
  color: #8c222c;
}

.right-span {
  font-size: 15px;
  float: left;
}
.right-span2 {
  font-size: 10px;float: right;margin-right: 20%;color: #a3a3ac
}
.right-span3 {
  font-size: 13px;float: left;color: #72727b
}
.right-span4 {
  font-size: 13px;float: left;color: #a3a3ac
}

.right-span2:hover {
  color: #8c222c;
}

.right-span3:hover {
  color: #8c222c;
}

.right-span4:hover {
  color: #8c222c;
}

</style>