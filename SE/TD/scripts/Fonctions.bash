#!/bin/bash

function MiniPing () {
ping -c 1 $1 > /dev/null
echo $?
}

MiniPing $1
