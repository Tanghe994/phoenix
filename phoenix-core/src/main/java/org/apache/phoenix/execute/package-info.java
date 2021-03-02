package org.apache.phoenix.execute;

/**
 *  1.visitor---主要是返回QueryPlan的信息统计：主要包括平均行统计、每行的字节统计、行数量统计
 *  2.AggregatePlan---Query plan for aggregating queries--》BaseQueryPlan--》QueryPlan--》StatementPlan
 *  3.BaseQueryPlan---Query plan that has no child plans--》QueryPlan--》StatementPlan
 *  4.ClientAggregatePlan---客户端聚合计划--》ClientProcessingPlan--》DelegateQueryPlan--》QueryPlan--》StatementPlan
 *  5.ClientScanPlan---客户端扫描计划--》ClientProcessingPlan--》DelegateQueryPlan--》QueryPlan--》StatementPlan
 *  6.CommitException---提交异常--》SQLException
 *  7.CorrelatePlan---相关计划--》DelegateQueryPlan--》QueryPlan--》StatementPlan
 *  8.CursorFetchPlan---游标尺度计划--》DelegateQueryPlan--》QueryPlan--》StatementPlan
 *  9.DescVarLengthFastByteComparisons---降序排列字节数
 *  10.HashJoinPlan---哈希--》DelegateQueryPlan--》QueryPlan--》StatementPlan
 *  11.LiteralResultIterationPlan--》BaseQueryPlan--》QueryPlan--》StatementPlan
 *  12.MutationState---Tracks the uncommitted stat--》SQLCloseable
 *  13.PhoenixTxIndexMutationGenerator
 *  14.RuntimeContextImpl--》RuntimeContext
 *  15.ScanPlan---基本标的查询计划--》BaseQueryPlan--》QueryPlan--》StatementPlan
 *  16.SortMergeJoinPlan--》QueryPlan--》StatementPlan
 *  17.TupleProjectionPlan--》DelegateQueryPlan--》QueryPlan--》StatementPlan
 *  18.TupleProjector
 *  19.UnionPlan---联合计划--》QueryPlan--》StatementPlan
 *  20.UnnestArrayPlan---嵌套计划--》DelegateQueryPlan--》QueryPlan--》StatementPlan
 */

