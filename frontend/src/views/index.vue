<template>
  <article class="list">
    <ul>
      <li v-for="item in posts" :key="item.No">
        <router-link :to="'posts' + item.No">
          <span class="thumb">
            <img class="cropImg" :src="item.img"/>
            <span class="cropBox" :style=" 'background-image:url(' + item.img + ');' "></span>
          </span>
          <span class="info">
            <strong class="tit">{{ item.title }}</strong>
            <span class="txt">{{ item.date }}</span>
          </span>
        </router-link>
      </li>
    </ul>
  </article>
</template>
<script>
import axios from 'axios';

export default {
  data() {
    return {
      posts: []
    };
  },
  computed: {
    hasResult: function () {
      return this.posts.length > 0
    }
  },

  created: function(){
      const baseURI = 'http://localhost:8087';
      axios.get(`${baseURI}/board`,{
        headers:{

        }
      })
      .then((result) => {
        this.posts = result.data
      }
  )},

  methods: {

  }
};
</script>

<style scoped lang="scss">

</style>
