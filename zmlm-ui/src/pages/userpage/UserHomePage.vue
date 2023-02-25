<template>
  <div>
    <div class="user-home-page-head">
      <div style="position: absolute">
        <el-avatar class="avatar" style="margin-top: 150px;margin-left: 350px;transition: 1s" :size="100" src="https://profile.csdnimg.cn/9/3/A/0_weixin_60566467" />
      </div>
      <div style="position: absolute;margin-top: 180px;margin-left: 480px;">
        <span style="font-size: 25px">人之托</span>
        <span class="user-home-page-head-img"></span>
      </div>
    </div>
    <div style="margin-left: 350px">
      <!--标签头-->
      <div class="user-record-head">
        <div @click="changeTitleStyle"
             :class="{'user-record-head-title':state.style.headTitleShow1,'user-record-head-title-show':!state.style.headTitleShow1}">
          <span>主页</span>
        </div>
        <div @click="changeTitleStyle"
             :class="{'user-record-head-title':state.style.headTitleShow2,'user-record-head-title-show':!state.style.headTitleShow2}"
             style="margin-left: 2%">
          <span>专辑</span>
        </div>
        <div @click="changeTitleStyle"
             :class="{'user-record-head-title':state.style.headTitleShow3,'user-record-head-title-show':!state.style.headTitleShow3}"
             style="margin-left: 2%">
          <span>声音</span>
        </div>
        <div @click="changeTitleStyle"
             :class="{'user-record-head-title':state.style.headTitleShow4,'user-record-head-title-show':!state.style.headTitleShow4}"
             style="margin-left: 2%">
          <span>订阅</span>
        </div>
        <div @click="changeTitleStyle"
             :class="{'user-record-head-title':state.style.headTitleShow5,'user-record-head-title-show':!state.style.headTitleShow5}"
             style="margin-left: 2%">
          <span>关注</span>
        </div>
        <div @click="changeTitleStyle"
             :class="{'user-record-head-title':state.style.headTitleShow6,'user-record-head-title-show':!state.style.headTitleShow6}"
             style="margin-left: 2%">
          <span>粉丝</span>
        </div>
      </div>
      <!--订阅-->
<!--      <template v-if="!state.style.headTitleShow1">
        <UserRecordSubscribe/>
      </template>
      &lt;!&ndash;听过&ndash;&gt;
      <template v-if="!state.style.headTitleShow2">
        <user-record-hear/>
      </template>&lt;!&ndash;已购&ndash;&gt;
      <template v-if="!state.style.headTitleShow3">
        <user-record-purchase/>
      </template>&lt;!&ndash;喜欢&ndash;&gt;
      <template v-if="!state.style.headTitleShow4">
        <UserRecordSubscribe/>
      </template>-->

    </div>

  </div>


</template>

<script  setup>
import {onMounted, reactive} from "vue";


const state =reactive({
  style: {
    headTitleShow1: true,
    headTitleShow2: true,
    headTitleShow3: true,
    headTitleShow4: true,
    headTitleShow5: true,
    headTitleShow6: true,
  }

})
const changeTitleStyle = (e) => {
  if (e.target.innerText === '主页') {
    state.style.headTitleShow1 = false;
    state.style.headTitleShow2 = true;
    state.style.headTitleShow3 = true;
    state.style.headTitleShow4 = true;
    state.style.headTitleShow5 = true;
    state.style.headTitleShow6 = true;
  } else if (e.target.innerText === '专辑') {
    state.style.headTitleShow1 = true;
    state.style.headTitleShow2 = false;
    state.style.headTitleShow3 = true;
    state.style.headTitleShow4 = true;
    state.style.headTitleShow5 = true;
    state.style.headTitleShow6 = true;
  } else if (e.target.innerText === '声音') {
    state.style.headTitleShow1 = true;
    state.style.headTitleShow2 = true;
    state.style.headTitleShow3 = false;
    state.style.headTitleShow4 = true;
    state.style.headTitleShow5 = true;
    state.style.headTitleShow6 = true;
  } else if (e.target.innerText === '订阅') {
    state.style.headTitleShow1 = true;
    state.style.headTitleShow2 = true;
    state.style.headTitleShow3 = true;
    state.style.headTitleShow4 = false;
    state.style.headTitleShow5 = true;
    state.style.headTitleShow6 = true;
  } else if (e.target.innerText === '关注') {
    state.style.headTitleShow1 = true;
    state.style.headTitleShow2 = true;
    state.style.headTitleShow3 = true;
    state.style.headTitleShow4 = true;
    state.style.headTitleShow5 = false;
    state.style.headTitleShow6 = true;
  } else if (e.target.innerText === '粉丝') {
    state.style.headTitleShow1 = true;
    state.style.headTitleShow2 = true;
    state.style.headTitleShow3 = true;
    state.style.headTitleShow4 = true;
    state.style.headTitleShow5 = true;
    state.style.headTitleShow6 = false;
  }
}
onMounted(()=>{

})
</script>

<style scoped>
.user-home-page-head{
/*  width: 100%;
  height: 300px;
  background-color: #85c539;*/
  background-image: url("../../image/背景.png");
/*  background-size: cover;
  background-repeat: no-repeat;
  position: relative;
  position: absolute;*/
  z-index: 0;
  left: 0;
  right: 0;
  height: 320px;
  background-repeat: no-repeat;
  background-size: 100%;
  background-position: center center;
  background-position-x: center;
  background-position-y: center;
  min-width: 1280px
}
.avatar:hover{
  transition: 1s;/* 定义旋转过渡时间 */
  transform:rotate(180deg);/* 定义旋转的角度 */
  /* 下面是兼容处理 */
  -ms-transform:rotate(180deg); /* IE 9 */
  cursor: pointer;
/*  -moz-transform:rotate(-180deg); !* Firefox *!
  -webkit-transform:rotate(-180deg); !* Safari and Chrome *!
  -o-transform:rotate(-180deg); !* Opera *!*/
}
.user-home-page-head-img{
  background-image: url("../../image/vip.png");
  background-size: 20px 20px;
  height: 20px;
  width: 20px;
  display: inline-block;
  margin-left: 3px;
}
.user-record-head-title {
  height: 50px;
  text-align: center;
  font-size: 18px;
  line-height: 60px;
  width: 80px;
  float: left;
}

.user-record-head-title-show {
  height: 50px;
  text-align: center;
  line-height: 60px;
  width: 80px;
  float: left;
  color: #8c222c;
  font-size: 20px;
  cursor: pointer;
  border-bottom: 3px solid #8c222c;
}

.user-record-head-title:hover {
  color: #8c222c;
  font-size: 22px;
  cursor: pointer;
  /*border-bottom: 3px solid #8c222c;*/
}
</style>