import request from '@/utils/request'
export function login(data) {
  return request({
    url: '/esi/oauth/token',
    method: 'post',
    data
  })
}
