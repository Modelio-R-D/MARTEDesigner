/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_nfps.standard.datatype;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.DataType;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_annexes_vsl_datatypes.standard.datatype.TupleTypeDataType;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link DataType} with << NfpType_DataType >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("686cc32c-e601-467e-9664-2de6f78eb2e0")
public class NfpTypeDataType extends TupleTypeDataType {
    @objid ("a3100b45-a490-4c2c-b05f-4d6e81c1472e")
    public static final String STEREOTYPE_NAME = "NfpType_DataType";

    @objid ("cd1d20aa-67ba-4c4f-b0ba-9a7478278163")
    public static final String NFPTYPE_DATATYPE_EXPRATTRIB_TAGTYPE = "NfpType_DataType_exprAttrib";

    @objid ("d2024f5c-6b3d-4837-87eb-012415802edf")
    public static final String NFPTYPE_DATATYPE_UNITATTRIB_TAGTYPE = "NfpType_DataType_unitAttrib";

    @objid ("b5dfa38d-57f5-4d51-98fa-52ea862962d9")
    public static final String NFPTYPE_DATATYPE_VALUEATTRIB_TAGTYPE = "NfpType_DataType_valueAttrib";

    /**
     * Tells whether a {@link NfpTypeDataType proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << NfpType_DataType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("02d3dd61-9b0d-412a-8e90-20d58eb9884e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && ((DataType) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, NfpTypeDataType.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link DataType} stereotyped << NfpType_DataType >> then instantiate a {@link NfpTypeDataType} proxy.
     * 
     * @return a {@link NfpTypeDataType} proxy on the created {@link DataType}.
     */
    @objid ("1fc2bcb7-8cc5-48b7-b864-8618cf73e8f5")
    public static NfpTypeDataType create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.DataType");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, NfpTypeDataType.STEREOTYPE_NAME);
        return NfpTypeDataType.instantiate((DataType)e);
    }

    /**
     * Tries to instantiate a {@link NfpTypeDataType} proxy from a {@link DataType} stereotyped << NfpType_DataType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a DataType
     * @return a {@link NfpTypeDataType} proxy or <i>null</i>.
     */
    @objid ("66ca42dd-ab68-4e80-bea7-eb066c9fc696")
    public static NfpTypeDataType instantiate(final DataType obj) {
        return NfpTypeDataType.canInstantiate(obj) ? new NfpTypeDataType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link NfpTypeDataType} proxy from a {@link DataType} stereotyped << NfpType_DataType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link DataType}
     * @return a {@link NfpTypeDataType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("cfd26aa8-7e96-431b-a3f5-1cd7db0b476a")
    public static NfpTypeDataType safeInstantiate(final DataType obj) throws IllegalArgumentException {
        if (NfpTypeDataType.canInstantiate(obj))
        	return new NfpTypeDataType(obj);
        else
        	throw new IllegalArgumentException("NfpTypeDataType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("7c2aa543-fe89-416b-b055-08a68ed630e2")
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        NfpTypeDataType other = (NfpTypeDataType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link DataType}. 
     * @return the DataType represented by this proxy, never null.
     */
    @objid ("98d6010b-099f-402c-8d8e-b3c5a81bdc3e")
    @Override
    public DataType getElement() {
        return (DataType)super.getElement();
    }

    /**
     * Getter for string property 'NfpType_DataType_exprAttrib'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4dbb578f-d2a9-4a55-8863-9b09390389bc")
    public String getNfpType_DataType_exprAttrib() {
        return this.elt.getTagValue(NfpTypeDataType.MdaTypes.NFPTYPE_DATATYPE_EXPRATTRIB_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'NfpType_DataType_unitAttrib'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("518f0bd6-53f9-4d15-b7ad-eb7aad19be4b")
    public String getNfpType_DataType_unitAttrib() {
        return this.elt.getTagValue(NfpTypeDataType.MdaTypes.NFPTYPE_DATATYPE_UNITATTRIB_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'NfpType_DataType_valueAttrib'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("284fc494-06b3-4b20-a275-67d234b5fc78")
    public String getNfpType_DataType_valueAttrib() {
        return this.elt.getTagValue(NfpTypeDataType.MdaTypes.NFPTYPE_DATATYPE_VALUEATTRIB_TAGTYPE_ELT);
    }

    @objid ("33ed3a88-fda7-4d95-815a-a92211b9f93d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'NfpType_DataType_exprAttrib'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("81a94441-0166-4024-b298-4d1e07621b56")
    public void setNfpType_DataType_exprAttrib(final String value) {
        this.elt.putTagValue(NfpTypeDataType.MdaTypes.NFPTYPE_DATATYPE_EXPRATTRIB_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'NfpType_DataType_unitAttrib'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7fd9c35a-aa7b-4aec-87bf-3a7def637129")
    public void setNfpType_DataType_unitAttrib(final String value) {
        this.elt.putTagValue(NfpTypeDataType.MdaTypes.NFPTYPE_DATATYPE_UNITATTRIB_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'NfpType_DataType_valueAttrib'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3e387009-d3e4-47b8-ad36-fe55f0bca1b8")
    public void setNfpType_DataType_valueAttrib(final String value) {
        this.elt.putTagValue(NfpTypeDataType.MdaTypes.NFPTYPE_DATATYPE_VALUEATTRIB_TAGTYPE_ELT, value);
    }

    @objid ("eda8dc0c-cee1-4463-b4b9-d159598c84a2")
    protected NfpTypeDataType(final DataType elt) {
        super(elt);
    }

    @objid ("fdb10adb-db23-4e44-8d9f-db5e5f883f0e")
    public static final class MdaTypes {
        @objid ("623bbce3-2d83-4732-9b02-dff99909326b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("603c228c-45bd-4b87-8f15-c25d52c88ca2")
        public static TagType NFPTYPE_DATATYPE_VALUEATTRIB_TAGTYPE_ELT;

        @objid ("d29cb80c-47d9-4617-916e-d5cd663c718f")
        public static TagType NFPTYPE_DATATYPE_UNITATTRIB_TAGTYPE_ELT;

        @objid ("55e6ba30-3fac-41b5-8787-b661ae8e68ed")
        public static TagType NFPTYPE_DATATYPE_EXPRATTRIB_TAGTYPE_ELT;

        @objid ("33404cf5-2422-42b1-97b3-5a71b1d0cf2c")
        private static Stereotype MDAASSOCDEP;

        @objid ("9689d409-0579-443c-925a-bd55ef64c6ee")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2d720f66-44de-40cb-8ebd-46eceaffb5f0")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "d9908614-0cce-11df-8525-001302895b2b");
            NFPTYPE_DATATYPE_VALUEATTRIB_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d9908618-0cce-11df-8525-001302895b2b");
            NFPTYPE_DATATYPE_UNITATTRIB_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d990861c-0cce-11df-8525-001302895b2b");
            NFPTYPE_DATATYPE_EXPRATTRIB_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d9908620-0cce-11df-8525-001302895b2b");
            MDAASSOCDEP = ctx.getModelingSession().findElementById(Stereotype.class, "94b7efa5-f94c-4d1d-896f-f103e56a8e2e");
            MDAASSOCDEP_ROLE = ctx.getModelingSession().findElementById(TagType.class, "7637f2fd-b750-43c1-a15c-5d0b084ca1cd");
        }


	static {
		if(MARTEModule.getInstance() != null) {
			init(MARTEModule.getInstance().getModuleContext());
		}
	}
    }

}
