/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwpower.standard.instance;

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
import org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwlayout.standard.instance.HwComponentInstance;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << HwCoolingSupply_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("fddc8720-612d-4886-a292-d0c35faacc29")
public class HwCoolingSupplyInstance extends HwComponentInstance {
    @objid ("ad2a0ace-6a0e-4214-a261-74d33f018997")
    public static final String STEREOTYPE_NAME = "HwCoolingSupply_Instance";

    @objid ("f24f6927-2253-4c07-920a-fb7f9f906e8c")
    public static final String HWCOOLINGSUPPLY_INSTANCE_COOLINGPOWER_TAGTYPE = "HwCoolingSupply_Instance_coolingPower";

    /**
     * Tells whether a {@link HwCoolingSupplyInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << HwCoolingSupply_Instance >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("85563106-4c42-4d2b-ae13-f1bd493adcc8")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwCoolingSupplyInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << HwCoolingSupply_Instance >> then instantiate a {@link HwCoolingSupplyInstance} proxy.
     * 
     * @return a {@link HwCoolingSupplyInstance} proxy on the created {@link Instance}.
     */
    @objid ("f63710bf-8943-434c-b377-daf8fc6a222f")
    public static HwCoolingSupplyInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwCoolingSupplyInstance.STEREOTYPE_NAME);
        return HwCoolingSupplyInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link HwCoolingSupplyInstance} proxy from a {@link Instance} stereotyped << HwCoolingSupply_Instance >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link HwCoolingSupplyInstance} proxy or <i>null</i>.
     */
    @objid ("3d5902d5-380a-4cdd-9a07-a9a3511d9542")
    public static HwCoolingSupplyInstance instantiate(final Instance obj) {
        return HwCoolingSupplyInstance.canInstantiate(obj) ? new HwCoolingSupplyInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwCoolingSupplyInstance} proxy from a {@link Instance} stereotyped << HwCoolingSupply_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link HwCoolingSupplyInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("c1410784-d799-47d6-a290-29819704b79e")
    public static HwCoolingSupplyInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (HwCoolingSupplyInstance.canInstantiate(obj))
        	return new HwCoolingSupplyInstance(obj);
        else
        	throw new IllegalArgumentException("HwCoolingSupplyInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("1bc8b3d9-ae92-471e-9fb7-ff1045179d1f")
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
        HwCoolingSupplyInstance other = (HwCoolingSupplyInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("6bf32d5e-59fc-4431-b0d6-6e74d62a1dd6")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for string property 'HwCoolingSupply_Instance_coolingPower'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bc023d62-9f62-44c0-8adf-7703156d920d")
    public String getHwCoolingSupply_Instance_coolingPower() {
        return this.elt.getTagValue(HwCoolingSupplyInstance.MdaTypes.HWCOOLINGSUPPLY_INSTANCE_COOLINGPOWER_TAGTYPE_ELT);
    }

    @objid ("142261a5-7eee-4851-a084-a7c925c6d0e8")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwCoolingSupply_Instance_coolingPower'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("613625d8-0417-4e4f-95c6-05b33175ed2e")
    public void setHwCoolingSupply_Instance_coolingPower(final String value) {
        this.elt.putTagValue(HwCoolingSupplyInstance.MdaTypes.HWCOOLINGSUPPLY_INSTANCE_COOLINGPOWER_TAGTYPE_ELT, value);
    }

    @objid ("b0143969-8ef2-4659-ad09-7768891f966b")
    protected HwCoolingSupplyInstance(final Instance elt) {
        super(elt);
    }

    @objid ("ea5d302c-15ba-42a0-a171-668999064a3c")
    public static final class MdaTypes {
        @objid ("da2b0a0b-bde0-46bb-a0c4-33775e66fc82")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("17d65fd4-a0f8-4e80-be6d-07d0270c9841")
        public static TagType HWCOOLINGSUPPLY_INSTANCE_COOLINGPOWER_TAGTYPE_ELT;

        @objid ("3ece08f2-5d4b-4d3f-9834-3b8afccf9230")
        private static Stereotype MDAASSOCDEP;

        @objid ("940e99fa-b552-456e-81a9-fb69fedcd69e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("56c4a574-f74e-4826-92c6-712de1a16ea1")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01973ac8-0ccf-11df-8525-001302895b2b");
            HWCOOLINGSUPPLY_INSTANCE_COOLINGPOWER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01973acf-0ccf-11df-8525-001302895b2b");
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
