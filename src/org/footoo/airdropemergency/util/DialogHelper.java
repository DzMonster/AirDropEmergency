package org.footoo.airdropemergency.util;

import org.footoo.airdropemergency.R;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

public class DialogHelper {

	/**
	 * ��ʾȷ�϶Ի���
	 * 
	 * @param context
	 * @param dialogOperationDone
	 * @param title
	 *            �Ի������
	 * @param Message
	 *            �Ի�����Ϣ��
	 */
	public static void showConfirmDialog(Context context,
			DialogHelper.DialogOperationDone dialogOperationDone, String title,
			String Message) {
		final DialogOperationDone fDialogOperationDone = dialogOperationDone;
		AlertDialog.Builder builder = new AlertDialog.Builder(context);
		builder.setTitle(title).setMessage(Message);
		builder.setPositiveButton(
				context.getResources().getString(R.string.ok),
				new DialogInterface.OnClickListener() {

					@Override
					public void onClick(DialogInterface dialog, int which) {
						fDialogOperationDone.ok();
					}
				});
		builder.setNegativeButton(context.getResources()
				.getString(R.string.cln),
				new DialogInterface.OnClickListener() {

					@Override
					public void onClick(DialogInterface dialog, int which) {
						fDialogOperationDone.cancle();
					}
				});
		builder.create().show();
	}

	/**
	 * �Ի���ȷ����ȡ��ʱ�Ĳ���
	 * 
	 * @author liushuai
	 * 
	 */
	public interface DialogOperationDone {
		/**
		 * ��ȷ���Ĳ���
		 */
		public void ok();

		/**
		 * ��ȡ���Ĳ���
		 */
		public void cancle();
	}
}
