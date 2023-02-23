<template>


  <el-timeline style="margin-top: 40px">
    <el-timeline-item center type="primary" timestamp="今天" color="hsl" placement="top">
      <div class="user-record-hear-card">
        <!--左边-->
        <div class="user-record-hear-card-left">
          <div class="user-record-hear-card-img">
            <el-avatar style="margin-top: 15%;margin-left: 15%" :size="70"
                       src="https://profile.csdnimg.cn/9/3/A/0_weixin_60566467"/>
          </div>
        </div>
        <!--右边-->
        <div class="user-record-hear-card-right">
          <div style="height: 40px;padding-top: 20px">
            <span style="font-size: 15px;float: left;">第35集 里筷子</span>
            <span style="font-size: 10px;float: right;margin-right: 20%;color: #a3a3ac">6小时前</span>
          </div>
          <div style="height: 40px">
            <span style="font-size: 13px;float: left;color: #72727b">13路末班车I又名惊魂夜车|惊悚恐怖灵异悬疑|精品探案力作|有声剧</span>
          </div>

        </div>
      </div>
    </el-timeline-item>
    <el-timeline-item timestamp="2018/4/3" placement="top">
      <el-card>
        <h4>Update Github template</h4>
        <p>Tom committed 2018/4/3 20:46</p>
      </el-card>
    </el-timeline-item>
    <el-timeline-item center timestamp="2018/4/2" placement="top">
      Event start
    </el-timeline-item>
    <el-timeline-item timestamp="2018/4/2" placement="top">
      Event end
    </el-timeline-item>
  </el-timeline>

</template>

<script setup>
import {onMounted, reactive} from "vue";


const state = reactive({})
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
}

.user-record-hear-card-left {
  float: left;
  width: 18%;
  height: 140px;
  background-color: #666666;
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

</style>