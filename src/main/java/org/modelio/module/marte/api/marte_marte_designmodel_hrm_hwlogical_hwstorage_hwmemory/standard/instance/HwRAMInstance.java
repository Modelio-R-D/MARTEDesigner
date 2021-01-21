/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.instance;

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
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << HwRAM_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("baa275e8-c78d-4976-a17e-1f54bbbcef15")
public class HwRAMInstance extends HwMemoryInstance {
    @objid ("cecd9c84-5c9e-41c2-999c-1063152f3ec1")
    public static final String STEREOTYPE_NAME = "HwRAM_Instance";

    @objid ("4b820aa0-16e4-4783-852f-316babb1dd59")
    public static final String HWRAM_INSTANCE_ISNONVOLATILE_TAGTYPE = "HwRAM_Instance_isNonVolatile";

    @objid ("4d90f734-a10f-47e6-98a8-ba43fe9c0651")
    public static final String HWRAM_INSTANCE_ISSTATIC_TAGTYPE = "HwRAM_Instance_isStatic";

    @objid ("8900cb0d-f66c-4f01-990b-bea2d8f24a0a")
    public static final String HWRAM_INSTANCE_ISSYNCHRONOUS_TAGTYPE = "HwRAM_Instance_isSynchronous";

    @objid ("6b079900-7146-4c15-bb2e-8f095e88dc8f")
    public static final String HWRAM_INSTANCE_ORGANIZATION_TAGTYPE = "HwRAM_Instance_organization";

    @objid ("9ddc42a6-4b00-4369-a024-7cd6917f79c4")
    public static final String HWRAM_INSTANCE_REPL_POLICY_TAGTYPE = "HwRAM_Instance_repl_Policy";

    @objid ("e8df4cf5-0141-4891-8ccf-0f7784c1050d")
    public static final String HWRAM_INSTANCE_WRITEPOLICY_TAGTYPE = "HwRAM_Instance_writePolicy";

    /**
     * Tells whether a {@link HwRAMInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << HwRAM_Instance >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("49c98cae-2c20-4478-9782-c1d98dd06fbb")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwRAMInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << HwRAM_Instance >> then instantiate a {@link HwRAMInstance} proxy.
     * 
     * @return a {@link HwRAMInstance} proxy on the created {@link Instance}.
     */
    @objid ("c521fd53-3f0d-40a9-a1b5-c659219cbc39")
    public static HwRAMInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwRAMInstance.STEREOTYPE_NAME);
        return HwRAMInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link HwRAMInstance} proxy from a {@link Instance} stereotyped << HwRAM_Instance >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link HwRAMInstance} proxy or <i>null</i>.
     */
    @objid ("2b79e1f0-3ccf-420c-8e71-2f0f9c1f49d4")
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
    @objid ("c37afeed-8577-413f-9b46-7fe47ac487df")
    public static HwRAMInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (HwRAMInstance.canInstantiate(obj))
        	return new HwRAMInstance(obj);
        else
        	throw new IllegalArgumentException("HwRAMInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("2d674f33-f191-444c-8b5d-d7331822de0d")
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
    @objid ("a5f11532-7978-4904-8f42-a99276d49474")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for string property 'HwRAM_Instance_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("290acd1c-8311-4d18-9c5c-df8686ec6b8a")
    public String getHwRAM_Instance_organization() {
        return this.elt.getTagValue(HwRAMInstance.MdaTypes.HWRAM_INSTANCE_ORGANIZATION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwRAM_Instance_repl_Policy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9b959c5c-df49-44c4-bcaf-1c4465f685f8")
    public String getHwRAM_Instance_repl_Policy() {
        return this.elt.getTagValue(HwRAMInstance.MdaTypes.HWRAM_INSTANCE_REPL_POLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwRAM_Instance_writePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b8be2be5-9450-432d-a25f-00adc5488451")
    public String getHwRAM_Instance_writePolicy() {
        return this.elt.getTagValue(HwRAMInstance.MdaTypes.HWRAM_INSTANCE_WRITEPOLICY_TAGTYPE_ELT);
    }

    @objid ("56de8af7-0ad6-4c20-ad55-d76e1e0d7079")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'HwRAM_Instance_isNonVolatile'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a07a814a-72ba-4fb1-9b38-ecd5ca0f1f94")
    public boolean isHwRAM_Instance_isNonVolatile() {
        return this.elt.isTagged(HwRAMInstance.MdaTypes.HWRAM_INSTANCE_ISNONVOLATILE_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'HwRAM_Instance_isStatic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9c77d344-c17c-401d-bbce-620275de25c5")
    public boolean isHwRAM_Instance_isStatic() {
        return this.elt.isTagged(HwRAMInstance.MdaTypes.HWRAM_INSTANCE_ISSTATIC_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'HwRAM_Instance_isSynchronous'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("42424b9d-c4f4-4623-a645-1d446b2f7673")
    public boolean isHwRAM_Instance_isSynchronous() {
        return this.elt.isTagged(HwRAMInstance.MdaTypes.HWRAM_INSTANCE_ISSYNCHRONOUS_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'HwRAM_Instance_isNonVolatile'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("52e44312-cd76-4799-9472-0989b334586b")
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
    @objid ("299b7818-aef1-4284-bc64-caa79c30596b")
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
    @objid ("055dbee2-6594-4986-852a-2d9b5af60cb6")
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
    @objid ("9688331f-efd5-4410-92a5-f9a418ee5361")
    public void setHwRAM_Instance_organization(final String value) {
        this.elt.putTagValue(HwRAMInstance.MdaTypes.HWRAM_INSTANCE_ORGANIZATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwRAM_Instance_repl_Policy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("70369e15-580c-4086-8f5a-4e16fcb4e3be")
    public void setHwRAM_Instance_repl_Policy(final String value) {
        this.elt.putTagValue(HwRAMInstance.MdaTypes.HWRAM_INSTANCE_REPL_POLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwRAM_Instance_writePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f14aba02-0b6a-46d3-aac3-37ee34c9ef82")
    public void setHwRAM_Instance_writePolicy(final String value) {
        this.elt.putTagValue(HwRAMInstance.MdaTypes.HWRAM_INSTANCE_WRITEPOLICY_TAGTYPE_ELT, value);
    }

    @objid ("3f46a32d-7b83-4721-aeab-d75a62fa04f1")
    protected HwRAMInstance(final Instance elt) {
        super(elt);
    }

    @objid ("c2fac196-dfca-4793-bbd6-81b4caeb3ae5")
    public static final class MdaTypes {
        @objid ("cfa06ba8-6892-4675-a928-efba9a8230cc")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("fef04b0a-f907-4115-8e05-93b889e8f40e")
        public static TagType HWRAM_INSTANCE_ORGANIZATION_TAGTYPE_ELT;

        @objid ("c410c51d-26ad-4ffc-be42-a7eba0f44df1")
        public static TagType HWRAM_INSTANCE_REPL_POLICY_TAGTYPE_ELT;

        @objid ("2d0d03cc-056e-4a69-97d1-33abd84c9f84")
        public static TagType HWRAM_INSTANCE_WRITEPOLICY_TAGTYPE_ELT;

        @objid ("87848fdb-971e-408c-a836-6627801509c2")
        public static TagType HWRAM_INSTANCE_ISSYNCHRONOUS_TAGTYPE_ELT;

        @objid ("15cb12a8-d290-46fa-856b-2b4892d0bc23")
        public static TagType HWRAM_INSTANCE_ISSTATIC_TAGTYPE_ELT;

        @objid ("daf5ef13-afb5-40b8-8f08-f97abae5e729")
        public static TagType HWRAM_INSTANCE_ISNONVOLATILE_TAGTYPE_ELT;

        @objid ("9ca6d45d-2d01-4eb4-8898-b86953fdd1ec")
        private static Stereotype MDAASSOCDEP;

        @objid ("efde19aa-246f-4be7-bc62-0115b772a020")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3162ca8a-7ef4-42c7-927e-927d4f67a6be")
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
