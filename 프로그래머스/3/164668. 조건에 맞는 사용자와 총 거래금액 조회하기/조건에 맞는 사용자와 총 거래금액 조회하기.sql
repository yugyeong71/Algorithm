SELECT ugu.USER_ID, ugu.NICKNAME, SUM(ugb.PRICE) AS TOTAL_SALES
FROM USED_GOODS_USER ugu
JOIN USED_GOODS_BOARD ugb ON ugb.WRITER_ID = ugu.USER_ID
WHERE ugb.STATUS = 'DONE'
GROUP BY ugu.USER_ID
HAVING TOTAL_SALES >= 700000
ORDER BY TOTAL_SALES