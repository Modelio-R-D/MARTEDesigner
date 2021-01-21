/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
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
    @objid ("6672718a-a8b2-4f87-bbf7-1284ca4dc455")
    public static final String STEREOTYPE_NAME = "NfpType_DataType";

    @objid ("59cae0d3-1580-4434-9200-e160fecf821d")
    public static final String NFPTYPE_DATATYPE_EXPRATTRIB_TAGTYPE = "NfpType_DataType_exprAttrib";

    @objid ("ead3e50d-cccf-4a01-989b-e31c99574d75")
    public static final String NFPTYPE_DATATYPE_UNITATTRIB_TAGTYPE = "NfpType_DataType_unitAttrib";

    @objid ("22326d56-6135-4aa5-ae30-67f0161ee95a")
    public static final String NFPTYPE_DATATYPE_VALUEATTRIB_TAGTYPE = "NfpType_DataType_valueAttrib";

    /**
     * Tells whether a {@link NfpTypeDataType proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << NfpType_DataType >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("2b0c6e8a-541d-4d70-bc54-290b447060f6")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && ((DataType) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, NfpTypeDataType.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link DataType} stereotyped << NfpType_DataType >> then instantiate a {@link NfpTypeDataType} proxy.
     * 
     * @return a {@link NfpTypeDataType} proxy on the created {@link DataType}.
     */
    @objid ("7fc49de0-dfb8-4582-b510-9f3496b13130")
    public static NfpTypeDataType create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("DataType");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, NfpTypeDataType.STEREOTYPE_NAME);
        return NfpTypeDataType.instantiate((DataType)e);
    }

    /**
     * Tries to instantiate a {@link NfpTypeDataType} proxy from a {@link DataType} stereotyped << NfpType_DataType >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a DataType
     * @return a {@link NfpTypeDataType} proxy or <i>null</i>.
     */
    @objid ("c043432a-25d0-4933-b971-f5bedf2fad60")
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
    @objid ("2e92da53-56f3-4824-a9b1-54139fb59348")
    public static NfpTypeDataType safeInstantiate(final DataType obj) throws IllegalArgumentException {
        if (NfpTypeDataType.canInstantiate(obj))
        	return new NfpTypeDataType(obj);
        else
        	throw new IllegalArgumentException("NfpTypeDataType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("9dc62b03-7531-4164-8b9a-3fd06d31e5ec")
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
    @objid ("aaede1e0-4d0e-402c-8c1c-c936b6dd9395")
    @Override
    public DataType getElement() {
        return (DataType)super.getElement();
    }

    /**
     * Getter for string property 'NfpType_DataType_exprAttrib'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("cdf22607-2298-4493-bf41-fad8b492b9c6")
    public String getNfpType_DataType_exprAttrib() {
        return this.elt.getTagValue(NfpTypeDataType.MdaTypes.NFPTYPE_DATATYPE_EXPRATTRIB_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'NfpType_DataType_unitAttrib'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a2920774-19f6-4393-8594-861b49edf9a3")
    public String getNfpType_DataType_unitAttrib() {
        return this.elt.getTagValue(NfpTypeDataType.MdaTypes.NFPTYPE_DATATYPE_UNITATTRIB_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'NfpType_DataType_valueAttrib'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0838e98d-b10b-42ad-a070-9388c6da9d7d")
    public String getNfpType_DataType_valueAttrib() {
        return this.elt.getTagValue(NfpTypeDataType.MdaTypes.NFPTYPE_DATATYPE_VALUEATTRIB_TAGTYPE_ELT);
    }

    @objid ("8d58b262-f7a9-4658-92b2-4663e891adfb")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'NfpType_DataType_exprAttrib'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c6df68e9-8f84-4ee8-a4cc-8a02704cf4f9")
    public void setNfpType_DataType_exprAttrib(final String value) {
        this.elt.putTagValue(NfpTypeDataType.MdaTypes.NFPTYPE_DATATYPE_EXPRATTRIB_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'NfpType_DataType_unitAttrib'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("afc01ade-9e92-4096-82be-4295bf0defb1")
    public void setNfpType_DataType_unitAttrib(final String value) {
        this.elt.putTagValue(NfpTypeDataType.MdaTypes.NFPTYPE_DATATYPE_UNITATTRIB_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'NfpType_DataType_valueAttrib'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9b5ea44e-1656-428b-9752-04daaeaf3f07")
    public void setNfpType_DataType_valueAttrib(final String value) {
        this.elt.putTagValue(NfpTypeDataType.MdaTypes.NFPTYPE_DATATYPE_VALUEATTRIB_TAGTYPE_ELT, value);
    }

    @objid ("c93f297a-9b0f-404c-863b-cd19e9958ed3")
    protected NfpTypeDataType(final DataType elt) {
        super(elt);
    }

    @objid ("fdb10adb-db23-4e44-8d9f-db5e5f883f0e")
    public static final class MdaTypes {
        @objid ("646d54aa-cf9d-4f1d-94fc-91b2e28d4ce6")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5345453d-7de1-4eb9-9dec-82f24057ea2f")
        public static TagType NFPTYPE_DATATYPE_VALUEATTRIB_TAGTYPE_ELT;

        @objid ("8f38ab32-c4f9-4d7c-950f-94fedb05e3aa")
        public static TagType NFPTYPE_DATATYPE_UNITATTRIB_TAGTYPE_ELT;

        @objid ("bda7778a-db5a-4e00-8706-1714a73c498c")
        public static TagType NFPTYPE_DATATYPE_EXPRATTRIB_TAGTYPE_ELT;

        @objid ("a853fd91-e714-4491-bc1a-4feb351e250a")
        private static Stereotype MDAASSOCDEP;

        @objid ("ee45690f-589a-4161-b394-8a13e2d87bc9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("70c4fd1b-65c3-4e47-be2a-013d99bae1a4")
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
