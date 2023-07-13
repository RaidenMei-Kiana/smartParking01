import request from '@/utils/request'

// 查询充电记录列表
export function listRecord(query) {
  return request({
    url: '/parking/record/list',
    method: 'get',
    params: query
  })
}

// 查询充电记录详细
export function getRecord(id) {
  return request({
    url: '/parking/record/' + id,
    method: 'get'
  })
}

// 新增充电记录
export function addRecord(data) {
  return request({
    url: '/parking/record',
    method: 'post',
    data: data
  })
}

// 修改充电记录
export function updateRecord(data) {
  return request({
    url: '/parking/record',
    method: 'put',
    data: data
  })
}

// 删除充电记录
export function delRecord(id) {
  return request({
    url: '/parking/record/' + id,
    method: 'delete'
  })
}
