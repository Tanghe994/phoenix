package org.apache.phoenix.filter;

/**
 * 1.DelegateFilter--》FilterBase（hadoop filter）
 * 2.AllVersionsIndexRebuildFilter--》DelegateFilter
 * 3.BooleanExpressionFilter--》FilterBase
 * 4.ColumnProjectionFilter---When selecting specific columns in a SELECT query, this filter passes only selected columns back to client.
 * 5.DistinctPrefixFilter---前缀筛选器--》FilterBase
 * 6.EncodedQualifiersColumnProjectionFilter--》FilterBase
 * 7.---
 */
