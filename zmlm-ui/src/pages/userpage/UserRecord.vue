<template>
  <div class="user-record">
    <!--标签头-->
    <div class="user-record-head">
      <div @click="changeTitleStyle"
           :class="{'user-record-head-title':state.style.headTitleShow1,'user-record-head-title-show':!state.style.headTitleShow1}">
        <svg style="float: left;margin-top: 23px" t="1677555397686" class="icon" viewBox="0 0 1024 1024" version="1.1"
             xmlns="http://www.w3.org/2000/svg"
             p-id="1783" :fill="state.style.headTitleShow1?'':'#8c222c'" width="20" height="18">
          <path
              d="M879.570052 604.289939l-57.671491 0 0.063445 315.00844c-0.005117 2.690272-0.167822 4.242627-0.319272 5.110391-1.485841-0.029676-2.90619-0.385786-3.527336-0.575098l-274.015817-162.930813c-2.408863-1.385557-15.283078-8.293897-32.145118-8.293897-15.418154 0-27.259854 5.619998-31.633465 8.037047l-277.131785 163.945933c-0.075725 0.016373-0.149403 0.031722-0.220011 0.047072-0.540306-0.596588-0.843204-1.451048-0.918929-1.787716l0.01842-793.842063c0-38.714743 30.705326-70.210062 68.447928-70.210062l482.860333 0c37.722136 0 68.412113 31.495318 68.412113 70.210062l0.020466 76.918857 57.667398 0 0-76.918857c0-71.136154-56.568367-129.008212-126.099976-129.008212l-482.860333 0c-69.536726 0-126.108163 57.873082-126.108163 129.008212l-0.027629 893.571439 7.036253-2.99931c47.444569-20.218484 340.53379-197.638289 356.509646-207.315696 0.623193-0.25685 2.369977-0.856507 4.02978-0.856507 1.068332 0 2.503007 0.286526 3.980661 0.793062 12.633738 7.54586 284.356326 169.773661 356.302939 207.212342l7.389294 3.845585L879.570052 604.289939z"
              p-id="1784"></path>
          <path
              d="M739.708654 591.286788 739.708654 448.048479 879.62224 448.048479 879.62224 389.269771 739.708654 389.269771 739.708654 246.029416 682.065815 246.029416 682.065815 389.269771 542.168602 389.269771 542.168602 448.048479 682.065815 448.048479 682.065815 591.286788Z"
              p-id="1785"></path>
        </svg>
        <span>订阅</span>
      </div>
      <div @click="changeTitleStyle"
           :class="{'user-record-head-title':state.style.headTitleShow2,'user-record-head-title-show':!state.style.headTitleShow2}"
           style="margin-left: 3%">
        <svg style="float: left;margin-top: 22px" t="1677556199233" class="icon" viewBox="0 0 1024 1024" version="1.1"
             xmlns="http://www.w3.org/2000/svg"
             p-id="2807" :fill="state.style.headTitleShow2?'':'#8c222c'" width="20" height="20">
          <path
              d="M827.871087 196.128913C743.498468 111.756293 631.321596 65.290005 512 65.290005c-119.319549 0-231.499491 46.465265-315.871087 130.837884S65.290005 392.680451 65.290005 512s46.465265 231.499491 130.837884 315.871087 196.551538 130.837884 315.871087 130.837884c119.321596 0 231.499491-46.465265 315.871087-130.837884S958.708971 631.319549 958.708971 512 912.243707 280.500509 827.871087 196.128913zM531.556405 917.246651l0-74.145697c0-11.31572-9.174963-20.491707-20.491707-20.491707-11.316743 0-20.491707 9.174963-20.491707 20.491707l0 74.059739C283.276738 906.322857 116.693746 739.164766 106.755396 531.634176l72.351841 0c11.31572 0 20.491707-9.174963 20.491707-20.491707 0-11.31572-9.174963-20.491707-20.491707-20.491707l-72.273047 0c10.769274-206.737528 177.01253-373.005342 383.740848-383.813502l0 72.346725c0 11.316743 9.174963 20.491707 20.491707 20.491707 11.31572 0 20.491707-9.17394 20.491707-20.491707L531.558451 106.752326c207.593012 9.901511 374.807385 176.539762 385.609405 383.89946l-74.142627 0c-11.316743 0-20.491707 9.174963-20.491707 20.491707 0 11.316743 9.174963 20.491707 20.491707 20.491707l74.220399 0C907.275555 739.78796 739.720422 907.317511 531.556405 917.246651z"
              p-id="2808"></path>
          <path
              d="M532.098757 503.118726 532.098757 258.240529c0-11.316743-9.174963-20.491707-20.491707-20.491707-11.31572 0-20.491707 9.17394-20.491707 20.491707l0 254.66612c0 7.858992 4.429893 14.677281 10.924817 18.114566L693.447539 722.42757c4.002151 4.000104 9.245572 6.001691 14.490016 6.001691s10.487865-2.001587 14.490016-6.001691c8.002254-8.002254 8.002254-20.977777 0-28.980032L532.098757 503.118726z"
              p-id="2809"></path>
        </svg>
        <span>听过</span>
      </div>
      <div @click="changeTitleStyle"
           :class="{'user-record-head-title':state.style.headTitleShow3,'user-record-head-title-show':!state.style.headTitleShow3}"
           style="margin-left: 3%">
        <svg :fill="state.style.headTitleShow3?'':'#8c222c'" t="1677556426894" style="float: left;margin-top: 22px"
             class="icon" viewBox="0 0 1024 1024" version="1.1" xmlns="http://www.w3.org/2000/svg" p-id="4019"
             width="20" height="20">
          <path
              d="M64 149.333333h64c12.949333 0 25.450667 10.965333 27.178667 23.978667l74.026666 555.029333C233.706667 762.304 264.384 789.333333 298.453333 789.333333H874.666667v-42.666666H298.474667c-12.629333 0-25.28-11.136-26.986667-23.978667L197.461333 167.68C192.938667 133.461333 162.346667 106.666667 128 106.666667H64v42.666666z"
              p-id="4020"></path>
          <path
              d="M277.333333 234.666667h597.504c10.453333 0 16.853333 7.402667 15.36 17.792l-51.968 363.712c-1.813333 12.757333-14.634667 23.829333-27.669333 23.829333H341.333333a21.333333 21.333333 0 0 0 0 42.666667h469.226667c34.24 0 65.066667-26.666667 69.909333-60.458667l51.968-363.712c5.141333-36.053333-21.162667-66.496-57.6-66.496H277.333333a21.333333 21.333333 0 0 0 0 42.666667z"
              p-id="4021"></path>
          <path
              d="M298.666667 896m-42.666667 0a42.666667 42.666667 0 1 0 85.333333 0 42.666667 42.666667 0 1 0-85.333333 0Z"
              p-id="4022"></path>
          <path
              d="M810.666667 896m-42.666667 0a42.666667 42.666667 0 1 0 85.333333 0 42.666667 42.666667 0 1 0-85.333333 0Z"
              p-id="4023"></path>
        </svg>
        <span>已购</span>
      </div>
      <div @click="changeTitleStyle"
           :class="{'user-record-head-title':state.style.headTitleShow4,'user-record-head-title-show':!state.style.headTitleShow4}"
           style="margin-left: 3%">
        <svg :fill="state.style.headTitleShow4?'':'#8c222c'" style="float: left;margin-top: 22px" t="1677556522761" class="icon" viewBox="0 0 1024 1024" version="1.1" xmlns="http://www.w3.org/2000/svg"
             p-id="5021" width="20" height="20">
          <path
              d="M752.9 58.4c31.1 0 61.4 6.7 90.1 20.1 30 13.9 57 34.4 80.3 61 23.5 26.9 41.7 58.2 54.2 93.3 12.1 34.1 18.2 70.1 18.2 107.1s-6.1 73-18.2 107.1c-12.3 34.8-30.4 65.9-53.6 92.6l-410.6 415-410.6-415c-23.2-26.7-41.3-57.9-53.6-92.6-12.1-34.1-18.2-70.1-18.2-107.1s6.1-73 18.2-107.1c12.4-35 30.7-66.4 54.2-93.3 23.3-26.6 50.3-47.1 80.3-61 28.7-13.3 59-20.1 90.1-20.1 31.1 0 61.4 6.7 90.1 20.1 30 13.9 57 34.4 80.3 61l47.9 54.8 21.4 24.4 21.4-24.4 47.9-54.8c23.3-26.6 50.3-47.1 80.3-61 28.5-13.4 58.8-20.1 89.9-20.1m0-28.4c-69.4 0-138.8 30.2-191.7 90.7l-47.9 54.8-47.9-54.8C412.3 60.2 343 30 273.6 30S134.8 60.2 81.8 120.7c-105.9 121-105.9 317.1 0 438l431.4 436 431.4-436c105.9-121 105.9-317.1 0-438C891.7 60.2 822.3 30 752.9 30z"
               p-id="5022"></path>
          <path
              d="M885.4 420c-3 0-6.1-1-8.7-3-6.2-4.8-7.3-13.7-2.5-19.9 5.3-6.7 6.3-9.1 8.3-13.7 1-2.3 2.2-5 3.9-8.4 3.5-7 12-9.8 19.1-6.3 7 3.5 9.8 12.1 6.3 19.1-1.4 2.8-2.4 5-3.2 7-2.4 5.5-4.5 10.3-11.9 19.8-2.9 3.5-7 5.4-11.3 5.4zM921.3 342.1h-1c-7.8-0.6-13.7-7.3-13.1-15.1 3.8-53.8-13.1-106.3-46.3-144.3-32.1-36.6-76.4-55.8-121.3-52.2-8.2 0.5-14.6-5.3-15.2-13.1-0.6-7.8 5.2-14.6 13.1-15.2 54.1-4.1 106.8 18.4 144.8 61.8 38.1 43.6 57.5 103.7 53.2 165-0.6 7.4-6.8 13.1-14.2 13.1z"
              p-id="5023"></path>
        </svg>
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