<template>
  <div class="user-record">
    <!--标签头-->
    <div class="user-record-head">
      <div @click="changeTitleStyle"
           :class="{'user-record-head-title':state.style.headTitleShow1,'user-record-head-title-show':!state.style.headTitleShow1}">
        <span>订阅</span>
      </div>
      <div @click="changeTitleStyle"
           :class="{'user-record-head-title':state.style.headTitleShow2,'user-record-head-title-show':!state.style.headTitleShow2}"
           style="margin-left: 2%">
        <span>听过</span>
      </div>
      <div @click="changeTitleStyle"
           :class="{'user-record-head-title':state.style.headTitleShow3,'user-record-head-title-show':!state.style.headTitleShow3}"
           style="margin-left: 2%">
        <span>已购</span>
      </div>
      <div @click="changeTitleStyle"
           :class="{'user-record-head-title':state.style.headTitleShow4,'user-record-head-title-show':!state.style.headTitleShow4}"
           style="margin-left: 2%">
        <span>喜欢</span>
      </div>
    </div>
    <!--订阅-->
    <template v-if="!state.style.headTitleShow1">
      <UserRecordSubscribe/>
    </template>
    <!--听过-->
    <template v-if="!state.style.headTitleShow2">
      <user-record-hear/>
    </template><!--已购-->
    <template v-if="!state.style.headTitleShow3">
      <user-record-purchase/>
    </template><!--喜欢-->
    <template v-if="!state.style.headTitleShow4">
      <UserRecordSubscribe/>
    </template>

  </div>


</template>

<script setup>
import {onMounted, reactive} from "vue";
import UserRecordSubscribe from "./UserRecordSubscribe.vue";
import UserRecordHear from "./UserRecordHear.vue";
import UserRecordPurchase from "./UserRecordPurchase.vue";


const state = reactive({
  style: {
    headTitleShow1: true,
    headTitleShow2: true,
    headTitleShow3: true,
    headTitleShow4: true,
    userRecordSort1: true,
    userRecordSort2: true,
    userRecordSort3: true,
  }

})
const test = (e) => {

}

//改选选中的样式
const changeTitleStyle = (e) => {
  if (e.target.innerText === '订阅') {
    state.style.headTitleShow1 = false;
    state.style.headTitleShow2 = true;
    state.style.headTitleShow3 = true;
    state.style.headTitleShow4 = true;
  } else if (e.target.innerText === '听过') {
    state.style.headTitleShow1 = true;
    state.style.headTitleShow2 = false;
    state.style.headTitleShow3 = true;
    state.style.headTitleShow4 = true;
  } else if (e.target.innerText === '已购') {
    state.style.headTitleShow1 = true;
    state.style.headTitleShow2 = true;
    state.style.headTitleShow3 = false;
    state.style.headTitleShow4 = true;
  } else if (e.target.innerText === '喜欢') {
    state.style.headTitleShow1 = true;
    state.style.headTitleShow2 = true;
    state.style.headTitleShow3 = true;
    state.style.headTitleShow4 = false;
  }
}


onMounted(() => {

})
</script>

<style scoped>
.user-record {
  width: 45%;
  height: auto;
  min-height: 400px;
  margin-left: 20%;
}

.user-record-head {
  width: 100%;
  height: 60px;
  background-color: #ffffff;
}

.user-record-head-title {
  height: 60px;
  text-align: center;
  font-size: 20px;
  line-height: 60px;
  width: 10%;
  float: left;
}

.user-record-head-title-show {
  height: 60px;
  text-align: center;
  line-height: 60px;
  width: 10%;
  float: left;
  color: #8c222c;
  font-size: 22px;
  cursor: pointer;
  border-bottom: 3px solid #8c222c;
}

.user-record-head-title:hover {
  color: #8c222c;
  font-size: 22px;
  cursor: pointer;
  border-bottom: 3px solid #8c222c;
}

.user-record-sort {
  margin-top: 2%;
  width: 100%;
  height: 40px;
  background-color: white;
  border-bottom: 0.5px solid #efefef;
}

.user-record-category {
  margin-top: 2%;
  width: 100%;
  height: 40px;
  background-color: white;
}

.user-record-sort {
  color: #666666
}

.user-record-category-span {
  color: #40404c;
  font-size: 10px;
}

.user-record-category-span:hover {
  color: #8c222c;
  cursor: pointer;
}

.user-record-sort-show {
  color: #8c222c
}

.user-record-sort:hover {
  color: #8c222c;
  cursor: pointer;
}

</style>