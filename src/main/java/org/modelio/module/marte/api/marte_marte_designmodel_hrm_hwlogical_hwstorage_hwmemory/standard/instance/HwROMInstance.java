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
 * Proxy class to handle a {@link Instance} with << HwROM_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("b5916928-4290-4688-b96f-b0a87b40fbf6")
public class HwROMInstance extends HwMemoryInstance {
    @objid ("92585eaa-15f4-4a57-924a-a6a82a5cf86e")
    public static final String STEREOTYPE_NAME = "HwROM_Instance";

    @objid ("b2fa9dae-000b-4c4a-a08d-73ed36f2a7da")
    public static final String HWROM_INSTANCE_ORGANIZATION_TAGTYPE = "HwROM_Instance_organization";

    @objid ("ffe6e7a1-bfc6-4632-9386-14e2548ad6a9")
    public static final String HWROM_INSTANCE_TYPE_TAGTYPE = "HwROM_Instance_type";

    /**
     * Tells whether a {@link HwROMInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << HwROM_Instance >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("d627239f-ba4f-4479-85d8-4daa79fc9fab")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwROMInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << HwROM_Instance >> then instantiate a {@link HwROMInstance} proxy.
     * 
     * @return a {@link HwROMInstance} proxy on the created {@link Instance}.
     */
    @objid ("53ccc306-c96d-466e-b438-4a09313c7871")
    public static HwROMInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwROMInstance.STEREOTYPE_NAME);
        return HwROMInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link HwROMInstance} proxy from a {@link Instance} stereotyped << HwROM_Instance >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link HwROMInstance} proxy or <i>null</i>.
     */
    @objid ("11bdf3a9-49a4-4054-b43c-4afe0d1730c9")
    public static HwROMInstance instantiate(final Instance obj) {
        return HwROMInstance.canInstantiate(obj) ? new HwROMInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwROMInstance} proxy from a {@link Instance} stereotyped << HwROM_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link HwROMInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("14f8352d-150b-4332-85c1-2ade8774e586")
    public static HwROMInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (HwROMInstance.canInstantiate(obj))
        	return new HwROMInstance(obj);
        else
        	throw new IllegalArgumentException("HwROMInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("32168ac1-3987-45e9-aa99-153948ab70a9")
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
        HwROMInstance other = (HwROMInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("adccf9de-f484-4cc0-9650-af47bc8e38d3")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for string property 'HwROM_Instance_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b229ee7a-a799-496c-86d8-a1e8e26cf4ac")
    public String getHwROM_Instance_organization() {
        return this.elt.getTagValue(HwROMInstance.MdaTypes.HWROM_INSTANCE_ORGANIZATION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwROM_Instance_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2a2b8aa9-372e-43ba-96ff-9d2898c3d866")
    public String getHwROM_Instance_type() {
        return this.elt.getTagValue(HwROMInstance.MdaTypes.HWROM_INSTANCE_TYPE_TAGTYPE_ELT);
    }

    @objid ("ac990c1f-8611-43ac-bd91-11da38899f2d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwROM_Instance_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e624cbc5-b6b4-4c38-90e9-9508637fc02e")
    public void setHwROM_Instance_organization(final String value) {
        this.elt.putTagValue(HwROMInstance.MdaTypes.HWROM_INSTANCE_ORGANIZATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwROM_Instance_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("32705709-c514-4d24-81e8-6a03471d9006")
    public void setHwROM_Instance_type(final String value) {
        this.elt.putTagValue(HwROMInstance.MdaTypes.HWROM_INSTANCE_TYPE_TAGTYPE_ELT, value);
    }

    @objid ("f42b609d-7004-4d10-a66c-751a0746d8a8")
    protected HwROMInstance(final Instance elt) {
        super(elt);
    }

    @objid ("f48db52e-e060-4848-8714-a3d5b264588e")
    public static final class MdaTypes {
        @objid ("48a4ac2b-8a3f-4a21-ba95-9f2dcb9eb1bc")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("58d98fe1-7463-47a5-b987-39e47724f0ea")
        public static TagType HWROM_INSTANCE_TYPE_TAGTYPE_ELT;

        @objid ("dcac3159-b445-481c-bf0a-e6e629c90957")
        public static TagType HWROM_INSTANCE_ORGANIZATION_TAGTYPE_ELT;

        @objid ("70678110-c300-47b5-8318-e8311b100c64")
        private static Stereotype MDAASSOCDEP;

        @objid ("b6245b2f-1402-4bf9-9c42-25505ce9f0e5")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1dc008a1-ffc9-4a05-b6e2-e72a485f0302")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0169eeac-0ccf-11df-8525-001302895b2b");
            HWROM_INSTANCE_TYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0169eeb3-0ccf-11df-8525-001302895b2b");
            HWROM_INSTANCE_ORGANIZATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0169eeba-0ccf-11df-8525-001302895b2b");
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
