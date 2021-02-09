/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.instance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
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
public class HwISAInstance extends HwResourceInstance {
    public static final String STEREOTYPE_NAME = "HwISA_Instance";

    public static final String HWISA_INSTANCE_FAMILY_TAGTYPE = "HwISA_Instance_family";

    public static final String HWISA_INSTANCE_INST_WIDTH_TAGTYPE = "HwISA_Instance_inst_Width";

    public static final String HWISA_INSTANCE_TYPE_TAGTYPE = "HwISA_Instance_type";

    /**
     * Tells whether a {@link HwISAInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << HwISA_Instance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwISAInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << HwISA_Instance >> then instantiate a {@link HwISAInstance} proxy.
     * 
     * @return a {@link HwISAInstance} proxy on the created {@link Instance}.
     */
    public static HwISAInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwISAInstance.STEREOTYPE_NAME);
        return HwISAInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link HwISAInstance} proxy from a {@link Instance} stereotyped << HwISA_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link HwISAInstance} proxy or <i>null</i>.
     */
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
    public static HwISAInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (HwISAInstance.canInstantiate(obj))
        	return new HwISAInstance(obj);
        else
        	throw new IllegalArgumentException("HwISAInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

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
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for string property 'HwISA_Instance_family'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwISA_Instance_family() {
        return this.elt.getTagValue(HwISAInstance.MdaTypes.HWISA_INSTANCE_FAMILY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwISA_Instance_inst_Width'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwISA_Instance_inst_Width() {
        return this.elt.getTagValue(HwISAInstance.MdaTypes.HWISA_INSTANCE_INST_WIDTH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwISA_Instance_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwISA_Instance_type() {
        return this.elt.getTagValue(HwISAInstance.MdaTypes.HWISA_INSTANCE_TYPE_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwISA_Instance_family'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwISA_Instance_family(final String value) {
        this.elt.putTagValue(HwISAInstance.MdaTypes.HWISA_INSTANCE_FAMILY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwISA_Instance_inst_Width'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwISA_Instance_inst_Width(final String value) {
        this.elt.putTagValue(HwISAInstance.MdaTypes.HWISA_INSTANCE_INST_WIDTH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwISA_Instance_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwISA_Instance_type(final String value) {
        this.elt.putTagValue(HwISAInstance.MdaTypes.HWISA_INSTANCE_TYPE_TAGTYPE_ELT, value);
    }

    protected HwISAInstance(final Instance elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWISA_INSTANCE_FAMILY_TAGTYPE_ELT;

        public static TagType HWISA_INSTANCE_INST_WIDTH_TAGTYPE_ELT;

        public static TagType HWISA_INSTANCE_TYPE_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
