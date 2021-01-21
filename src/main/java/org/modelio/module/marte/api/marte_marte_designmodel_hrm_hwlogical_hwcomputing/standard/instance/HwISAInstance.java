/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.instance;

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
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.instance.HwResourceInstance;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << HwISA_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("c70f44dd-9bd5-4473-860a-2e0454515ce7")
public class HwISAInstance extends HwResourceInstance {
    @objid ("773db88c-f9d6-4455-ab5f-cc91714f7c97")
    public static final String STEREOTYPE_NAME = "HwISA_Instance";

    @objid ("fef67717-a291-4336-9df8-cfc05d8ff02a")
    public static final String HWISA_INSTANCE_FAMILY_TAGTYPE = "HwISA_Instance_family";

    @objid ("03f17e01-77fa-4a88-bd9d-88c606eef348")
    public static final String HWISA_INSTANCE_INST_WIDTH_TAGTYPE = "HwISA_Instance_inst_Width";

    @objid ("e5550c67-732d-415d-85c3-9bf00cbfa033")
    public static final String HWISA_INSTANCE_TYPE_TAGTYPE = "HwISA_Instance_type";

    /**
     * Tells whether a {@link HwISAInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << HwISA_Instance >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("01694a0c-9159-4eee-abf6-c57284e0fa44")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwISAInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << HwISA_Instance >> then instantiate a {@link HwISAInstance} proxy.
     * 
     * @return a {@link HwISAInstance} proxy on the created {@link Instance}.
     */
    @objid ("dfe8e53e-eb7c-4ebd-9b8a-5c6d1cfe2ddf")
    public static HwISAInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwISAInstance.STEREOTYPE_NAME);
        return HwISAInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link HwISAInstance} proxy from a {@link Instance} stereotyped << HwISA_Instance >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link HwISAInstance} proxy or <i>null</i>.
     */
    @objid ("cfd22b1a-bf37-4a12-9b1d-959225e38db3")
    public static HwISAInstance instantiate(final Instance obj) {
        return HwISAInstance.canInstantiate(obj) ? new HwISAInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwISAInstance} proxy from a {@link Instance} stereotyped << HwISA_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link HwISAInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("ab8fecbf-da30-4d9f-b04d-012e640c5047")
    public static HwISAInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (HwISAInstance.canInstantiate(obj))
        	return new HwISAInstance(obj);
        else
        	throw new IllegalArgumentException("HwISAInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ed0af122-b630-49f9-9318-22f053ea8993")
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
        HwISAInstance other = (HwISAInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("6e4eeaa6-b9ba-467d-bb75-7b37c0cdf190")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for string property 'HwISA_Instance_family'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f30c4201-19db-4725-996f-77f7be10ce72")
    public String getHwISA_Instance_family() {
        return this.elt.getTagValue(HwISAInstance.MdaTypes.HWISA_INSTANCE_FAMILY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwISA_Instance_inst_Width'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9beb6c08-fb71-4caf-96bc-b5a5c5c11243")
    public String getHwISA_Instance_inst_Width() {
        return this.elt.getTagValue(HwISAInstance.MdaTypes.HWISA_INSTANCE_INST_WIDTH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwISA_Instance_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e596843f-948d-4193-b83d-00a0156a9f3c")
    public String getHwISA_Instance_type() {
        return this.elt.getTagValue(HwISAInstance.MdaTypes.HWISA_INSTANCE_TYPE_TAGTYPE_ELT);
    }

    @objid ("a0f4faca-cfb0-4d09-a2e7-b5a4429f3434")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwISA_Instance_family'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("349f0f6e-bb69-4ef4-bfb0-6bccd1734dca")
    public void setHwISA_Instance_family(final String value) {
        this.elt.putTagValue(HwISAInstance.MdaTypes.HWISA_INSTANCE_FAMILY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwISA_Instance_inst_Width'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("dae0e57d-907c-4148-a641-d8731e598c8c")
    public void setHwISA_Instance_inst_Width(final String value) {
        this.elt.putTagValue(HwISAInstance.MdaTypes.HWISA_INSTANCE_INST_WIDTH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwISA_Instance_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("532b1227-d1b1-48be-b205-58a9e2a71c27")
    public void setHwISA_Instance_type(final String value) {
        this.elt.putTagValue(HwISAInstance.MdaTypes.HWISA_INSTANCE_TYPE_TAGTYPE_ELT, value);
    }

    @objid ("48b282d7-f4f8-4a79-a3f0-c2fc805a4c9e")
    protected HwISAInstance(final Instance elt) {
        super(elt);
    }

    @objid ("03fd23c6-9812-4bc1-98af-4162b1510a8f")
    public static final class MdaTypes {
        @objid ("49e1272c-97b5-42ee-9ad3-853b4f489154")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("285aa97b-3249-46fc-86a5-d7a13c04ec91")
        public static TagType HWISA_INSTANCE_FAMILY_TAGTYPE_ELT;

        @objid ("188b8ae3-09b4-490c-a69f-6e3aaaa1b11d")
        public static TagType HWISA_INSTANCE_INST_WIDTH_TAGTYPE_ELT;

        @objid ("859ebc4d-1f11-4962-92b6-d8fd4b00b52b")
        public static TagType HWISA_INSTANCE_TYPE_TAGTYPE_ELT;

        @objid ("93afb97e-0b09-4ff7-9042-c17e5d60b14c")
        private static Stereotype MDAASSOCDEP;

        @objid ("9af4a093-3d05-48b2-8d05-50b10a598a0a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f11a98bf-0878-4345-a080-37a3a1852961")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00f77f52-0ccf-11df-8525-001302895b2b");
            HWISA_INSTANCE_FAMILY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00f77f59-0ccf-11df-8525-001302895b2b");
            HWISA_INSTANCE_INST_WIDTH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00f77f60-0ccf-11df-8525-001302895b2b");
            HWISA_INSTANCE_TYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00f77f67-0ccf-11df-8525-001302895b2b");
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
