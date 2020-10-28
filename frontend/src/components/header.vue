<template>
  <!--
  <header class="topLayout">
    <nav>
      <ul>
        <li><router-link to="/boardGalleryList"><i class="fas fa-list-ul"></i></router-link></li>
        <li><router-link to="/info"><i class="fas fa-user"></i></router-link></li>
      </ul>
    </nav>
  </header>
  -->

  <header class="topLayout">
    <div class="topLayoutIn">
      <h1 class="logo"><router-link to="/"><img src="@/assets/images/logo.png" alt="EOD"/></router-link></h1>
      <nav>
        <ul>
          <li>
            <router-link to="/intro">menu1</router-link>
            <ul>
              <li><router-link to="/intro">2depth</router-link></li>
            </ul>
          </li>
          <li>
            <router-link to="/intro">menu2</router-link>
            <ul>
              <li><router-link to="/intro">2depth</router-link></li>
            </ul>
          </li>
          <li>
            <router-link to="/intro">menu3</router-link>
            <ul>
              <li><router-link to="/intro">2depth</router-link></li>
            </ul>
          </li>
          <li>
            <router-link to="/intro">menu4</router-link>
            <ul>
              <li><router-link to="/intro">2depth</router-link></li>
            </ul>
          </li>
          <li>
            <router-link to="/intro">menu5</router-link>
            <ul>
              <li><router-link to="/intro">2depth</router-link></li>
            </ul>
          </li>
        </ul>
        <a class="moballMenu" href="javascript:void(0);">allMenu</a>
      </nav>
    </div>
  </header>


</template>

<script>
export default {
  data(){
    return{
      activeClass: 'active',
      errorClass: 'text-danger'
    }
  },
  computed: {

  }
}
</script>

<style scoped lang="scss">

</style>
