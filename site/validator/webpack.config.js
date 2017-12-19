const path = require('path');
const webpack = require('webpack');

module.exports = {
    entry: {
        validator: './validator/src/index.js'
    },
    output: {
        path: path.resolve(__dirname, '../hugo/static/js/validator'),
        filename: '[name].js',
    },
    plugins: [
        new webpack.optimize.UglifyJsPlugin()
    ]
};
