/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.instance;

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
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << HwRAM_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwRAMInstance extends HwMemoryInstance {
    public static final String STEREOTYPE_NAME = "HwRAM_Instance";

    public static final String HWRAM_INSTANCE_ISNONVOLATILE_TAGTYPE = "HwRAM_Instance_isNonVolatile";

    public static final String HWRAM_INSTANCE_ISSTATIC_TAGTYPE = "HwRAM_Instance_isStatic";

    public static final String HWRAM_INSTANCE_ISSYNCHRONOUS_TAGTYPE = "HwRAM_Instance_isSynchronous";

    public static final String HWRAM_INSTANCE_ORGANIZATION_TAGTYPE = "HwRAM_Instance_organization";

    public static final String HWRAM_INSTANCE_REPL_POLICY_TAGTYPE = "HwRAM_Instance_repl_Policy";

    public static final String HWRAM_INSTANCE_WRITEPOLICY_TAGTYPE = "HwRAM_Instance_writePolicy";

    /**
     * Tells whether a {@link HwRAMInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << HwRAM_Instance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwRAMInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << HwRAM_Instance >> then instantiate a {@link HwRAMInstance} proxy.
     * 
     * @return a {@link HwRAMInstance} proxy on the created {@link Instance}.
     */
    public static HwRAMInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwRAMInstance.STEREOTYPE_NAME);
        return HwRAMInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link HwRAMInstance} proxy from a {@link Instance} stereotyped << HwRAM_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link HwRAMInstance} proxy or <i>null</i>.
     */
    public static HwRAMInstance instantiate(final Instance obj) {
        return HwRAMInstance.canInstantiate(obj) ? new HwRAMInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwRAMInstance} proxy from a {@link Instance} stereotyped << HwRAM_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link HwRAMInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwRAMInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (HwRAMInstance.canInstantiate(obj))
        	return new HwRAMInstance(obj);
        else
        	throw new IllegalArgumentException("HwRAMInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwRAMInstance other = (HwRAMInstance) obj;
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
     * Getter for string property 'HwRAM_Instance_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwRAM_Instance_organization() {
        return this.elt.getTagValue(HwRAMInstance.MdaTypes.HWRAM_INSTANCE_ORGANIZATION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwRAM_Instance_repl_Policy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwRAM_Instance_repl_Policy() {
        return this.elt.getTagValue(HwRAMInstance.MdaTypes.HWRAM_INSTANCE_REPL_POLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwRAM_Instance_writePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwRAM_Instance_writePolicy() {
        return this.elt.getTagValue(HwRAMInstance.MdaTypes.HWRAM_INSTANCE_WRITEPOLICY_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'HwRAM_Instance_isNonVolatile'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isHwRAM_Instance_isNonVolatile() {
        return this.elt.isTagged(HwRAMInstance.MdaTypes.HWRAM_INSTANCE_ISNONVOLATILE_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'HwRAM_Instance_isStatic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isHwRAM_Instance_isStatic() {
        return this.elt.isTagged(HwRAMInstance.MdaTypes.HWRAM_INSTANCE_ISSTATIC_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'HwRAM_Instance_isSynchronous'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isHwRAM_Instance_isSynchronous() {
        return this.elt.isTagged(HwRAMInstance.MdaTypes.HWRAM_INSTANCE_ISSYNCHRONOUS_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'HwRAM_Instance_isNonVolatile'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwRAM_Instance_isNonVolatile(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(HwRAMInstance.MdaTypes.HWRAM_INSTANCE_ISNONVOLATILE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(HwRAMInstance.MdaTypes.HWRAM_INSTANCE_ISNONVOLATILE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'HwRAM_Instance_isStatic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwRAM_Instance_isStatic(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(HwRAMInstance.MdaTypes.HWRAM_INSTANCE_ISSTATIC_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(HwRAMInstance.MdaTypes.HWRAM_INSTANCE_ISSTATIC_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'HwRAM_Instance_isSynchronous'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwRAM_Instance_isSynchronous(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(HwRAMInstance.MdaTypes.HWRAM_INSTANCE_ISSYNCHRONOUS_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(HwRAMInstance.MdaTypes.HWRAM_INSTANCE_ISSYNCHRONOUS_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'HwRAM_Instance_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwRAM_Instance_organization(final String value) {
        this.elt.putTagValue(HwRAMInstance.MdaTypes.HWRAM_INSTANCE_ORGANIZATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwRAM_Instance_repl_Policy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwRAM_Instance_repl_Policy(final String value) {
        this.elt.putTagValue(HwRAMInstance.MdaTypes.HWRAM_INSTANCE_REPL_POLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwRAM_Instance_writePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwRAM_Instance_writePolicy(final String value) {
        this.elt.putTagValue(HwRAMInstance.MdaTypes.HWRAM_INSTANCE_WRITEPOLICY_TAGTYPE_ELT, value);
    }

    protected HwRAMInstance(final Instance elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWRAM_INSTANCE_ORGANIZATION_TAGTYPE_ELT;

        public static TagType HWRAM_INSTANCE_REPL_POLICY_TAGTYPE_ELT;

        public static TagType HWRAM_INSTANCE_WRITEPOLICY_TAGTYPE_ELT;

        public static TagType HWRAM_INSTANCE_ISSYNCHRONOUS_TAGTYPE_ELT;

        public static TagType HWRAM_INSTANCE_ISSTATIC_TAGTYPE_ELT;

        public static TagType HWRAM_INSTANCE_ISNONVOLATILE_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01593e73-0ccf-11df-8525-001302895b2b");
            HWRAM_INSTANCE_ORGANIZATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "015ba0c5-0ccf-11df-8525-001302895b2b");
            HWRAM_INSTANCE_REPL_POLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "015ba0e1-0ccf-11df-8525-001302895b2b");
            HWRAM_INSTANCE_WRITEPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "015e0316-0ccf-11df-8525-001302895b2b");
            HWRAM_INSTANCE_ISSYNCHRONOUS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "c3a73c6d-170f-11df-b92a-0014222a9f79");
            HWRAM_INSTANCE_ISSTATIC_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "c3a73c6e-170f-11df-b92a-0014222a9f79");
            HWRAM_INSTANCE_ISNONVOLATILE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "c3a73c6f-170f-11df-b92a-0014222a9f79");
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
