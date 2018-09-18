const path = require('path');
const webpack = require('webpack');

module.exports = {
    entry: {
        validator: './src/main/js/validator.js'
    },
    output: {
        path: path.resolve(__dirname, 'build/output/js'),
        filename: '[name].js',
    },
    plugins: [
        new webpack.optimize.UglifyJsPlugin()
    ]
};
