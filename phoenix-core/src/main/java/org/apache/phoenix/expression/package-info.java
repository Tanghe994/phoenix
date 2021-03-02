package org.apache.phoenix.expression;

/**
 *  expression
 *  1.aggregator---聚合
 *  2.function---函数
 *  3.rewrite---重写
 *  4.util
 *  5.visitor---
 *  6.AddExpression---Add表达式--》BaseAddSubtractExpression--》ArithmeticExpression--》BaseCompoundExpression--》BaseExpression--》Expression
 *  7.AndExpression---And表达式--》AndOrExpression--》BaseCompoundExpression
 *  8.AndOrExpression--》Abstract expression implementation for compound AND and OR expressions--》BaseCompoundExpression
 *  9.ArithmeticExpression
 *  10.ArrayConstructorExpression---Creates an expression for Upsert with Values/Select using ARRAY--》BaseCompoundExpression
 *  11.BaseAddSubtractExpression---加减表达式
 *  12.BaseCompoundExpression---基础算式表达式
 *  13.BaseDecimalAddSubtractExpression---十进制
 *  14.BaseExpression---基础表达式
 *  15.BaseSingleExpression---Base class for expressions which have a single child expression--》BaseExpression--》Expression
 *  16.BaseTerminalExpression---Grouping class for expression that have no expression children--》BaseExpression--》Expression
 *  17.ByteBasedLikeExpression--》LikeExpression--》BaseCompoundExpression--》BaseExpression-->Expression
 *  18.CaseExpression---CASE/WHEN expression implementation--》BaseCompoundExpression--》BaseExpression--》Expression
 *  19.CoerceExpression--》BaseSingleExpression--》BaseExpression--》Expression
 *  20.ColumnExpression--》BaseTerminalExpression--》BaseExpression--》Expression
 *  21.ComparisonExpression---大于小于符号比较表达式--》BaseCompoundExpression--》BaseExpression--》Expression
 *  22.CorrelateVariableFieldAccessExpression--》BaseTerminalExpression--》BaseExpression--》Expression
 *  23.CurrentDateTimeFunction--》ScalarFunction--》FunctionExpression--》BaseCompoundExpression--》BaseExpression--》Expression、
 *  24.DateAddExpression--》AddExpression
 *  25.DateSubtractExpression--》SubtractExpression--》BaseAddSubtractExpression
 *  26.DecimalAddExpression---十进制加法表达式--》AddExpression
 *  27.DecimalDivideExpression---十进制除法表达式--》DivideExpression--》ArithmeticExpression
 *  28.DecimalMultiplyExpression---十进制乘法表达式--》MultiplyExpression--》ArithmeticExpression
 *  29.DecimalSubtractExpression---十进制减法表达式--》SubtractExpression--》BaseAddSubtractExpression--》ArithmeticExpression
 *  30.DelegateExpression--》Expression
 *  31.Determinism
 *  32.DivideExpression--》Divide expression implementation
 *  33.DoubleAddExpression---二进制加法表达式
 *  34.DoubleDivideExpression
 *  35.DoubleMultiplyExpression
 *  36.DoubleSubtractExpression
 *  37.Expression---表达式的基础实现接口
 *  38.ExpressionType---表达式类型判定，用于客户端和服务端之间
 *  39.InListExpression---实现IN关键字--》BaseSingleExpression
 *  40.IsNullExpression---实现lsNull和lsNotNull表达式--》BaseSingleExpression
 *  41.KeyValueColumnExpression---Class to access a column value stored in a KeyValue--》ColumnExpression
 *  42.LikeExpression---like关键字表达式
 *  43.LiteralExpression---Accessor for a literal value-->BaseTerminalExpression
 *  44.LongAddExpression、LongDivideExpression、LongMultiplyExpression、LongSubtractExpression
 *  45.ModulusExpression
 *  46.MultiplyExpression
 *  47.NotExpression---Not关键字--》BaseSingleExpression
 *  48.OrderByExpression---OrderBy表达式
 *  49.OrExpression---Or关键字--》AndOrExpression--》BaseCompoundExpression
 *  50.ProjectedColumnExpression--》ColumnExpression
 *  51.RowKeyColumnExpression--》ColumnExpression
 *  52.RowKeyExpression--》BaseTerminalExpression
 *  53.RowValueConstructorExpression--》BaseCompoundExpression
 *  54.SingleCellColumnExpression、
 *  55.SingleCellConstructorExpression
 *  56.StringBasedLikeExpression
 *  57.StringConcatExpression
 *  58.SubtractExpression---减法表达式
 *  59.TimestampAddExpression---时间戳添加表达式
 *  60.TimestampSubtractExpression---时间戳减法表达式
 */
