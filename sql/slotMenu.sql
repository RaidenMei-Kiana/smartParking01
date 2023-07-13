-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('停车位', '3', '1', 'slot', 'parking/slot/index', 1, 0, 'C', '0', '0', 'parking:slot:list', '#', 'admin', sysdate(), '', null, '停车位菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('停车位查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'parking:slot:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('停车位新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'parking:slot:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('停车位修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'parking:slot:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('停车位删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'parking:slot:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('停车位导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'parking:slot:export',       '#', 'admin', sysdate(), '', null, '');