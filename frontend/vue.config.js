 module.exports = {
  devServer: {
    overlay: false,
    proxy: "http://localhost:8087/"
  },

  chainWebpack(config) {
    config.devtool('source-map');
    config.module
      .rule('images')
      .use('url-loader')
      .loader('url-loader')
      .tap(options => {
          options.limit = -1
          return options
      })
  },
  css: {
    sourceMap : true,
  },

  outputDir:'../src/main/resources/static',
  publicPath: process.env.NODE_ENV === 'production'
      ? '/'
      : '/'
}
