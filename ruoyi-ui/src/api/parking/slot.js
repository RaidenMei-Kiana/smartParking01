import request from '@/utils/request'

// 查询停车位列表
export function listSlot(query) {
  return request({
    url: '/parking/slot/list',
    method: 'get',
    params: query
  })
}

// 查询停车位详细
export function getSlot(id) {
  return request({
    url: '/parking/slot/' + id,
    method: 'get'
  })
}

// 新增停车位
export function addSlot(data) {
  return request({
    url: '/parking/slot',
    method: 'post',
    data: data
  })
}

// 修改停车位
export function updateSlot(data) {
  return request({
    url: '/parking/slot',
    method: 'put',
    data: data
  })
}

// 删除停车位
export function delSlot(id) {
  return request({
    url: '/parking/slot/' + id,
    method: 'delete'
  })
}
