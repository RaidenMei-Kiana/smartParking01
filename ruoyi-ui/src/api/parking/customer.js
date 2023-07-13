import request from '@/utils/request'

// 查询用户列表
export function listCustomer(query) {
  return request({
    url: '/parking/customer/list',
    method: 'get',
    params: query
  })
}

// 查询用户详细
export function getCustomer(id) {
  return request({
    url: '/parking/customer/' + id,
    method: 'get'
  })
}

// 新增用户
export function addCustomer(data) {
  return request({
    url: '/parking/customer',
    method: 'post',
    data: data
  })
}

// 修改用户
export function updateCustomer(data) {
  return request({
    url: '/parking/customer',
    method: 'put',
    data: data
  })
}

// 删除用户
export function delCustomer(id) {
  return request({
    url: '/parking/customer/' + id,
    method: 'delete'
  })
}
