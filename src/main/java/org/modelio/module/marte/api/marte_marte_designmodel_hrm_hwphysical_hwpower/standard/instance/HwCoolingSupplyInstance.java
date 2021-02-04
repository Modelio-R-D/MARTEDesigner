/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
    @objid ("6386cd27-9121-4f15-bc27-9a7f5f3e32cd")
    public static final String STEREOTYPE_NAME = "HwCoolingSupply_Instance";

    @objid ("4f946d19-278b-4903-a3e4-e1914c3756db")
    public static final String HWCOOLINGSUPPLY_INSTANCE_COOLINGPOWER_TAGTYPE = "HwCoolingSupply_Instance_coolingPower";

    /**
     * Tells whether a {@link HwCoolingSupplyInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << HwCoolingSupply_Instance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("3aeb5a57-bf4a-42b1-bbd8-3eeb33067704")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwCoolingSupplyInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << HwCoolingSupply_Instance >> then instantiate a {@link HwCoolingSupplyInstance} proxy.
     * 
     * @return a {@link HwCoolingSupplyInstance} proxy on the created {@link Instance}.
     */
    @objid ("a4901e8d-6b47-4346-9501-888e3b23493c")
    public static HwCoolingSupplyInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwCoolingSupplyInstance.STEREOTYPE_NAME);
        return HwCoolingSupplyInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link HwCoolingSupplyInstance} proxy from a {@link Instance} stereotyped << HwCoolingSupply_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link HwCoolingSupplyInstance} proxy or <i>null</i>.
     */
    @objid ("e2ed59b9-fa2e-4f1a-8ce5-1098881fd0fd")
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
    @objid ("f195843a-c69e-4d26-b623-996dcc3581d5")
    public static HwCoolingSupplyInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (HwCoolingSupplyInstance.canInstantiate(obj))
        	return new HwCoolingSupplyInstance(obj);
        else
        	throw new IllegalArgumentException("HwCoolingSupplyInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("fab3bf2d-fa62-40b9-a416-eac33fc1d402")
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
    @objid ("886b0ec0-4ce9-4a9c-964f-cac08a6a1e3b")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for string property 'HwCoolingSupply_Instance_coolingPower'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ae910399-bbbf-49f5-b085-bfb3220baa22")
    public String getHwCoolingSupply_Instance_coolingPower() {
        return this.elt.getTagValue(HwCoolingSupplyInstance.MdaTypes.HWCOOLINGSUPPLY_INSTANCE_COOLINGPOWER_TAGTYPE_ELT);
    }

    @objid ("5aae3301-c14a-40aa-a55f-4bc81dbef2c7")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwCoolingSupply_Instance_coolingPower'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b263e856-f4bf-42d1-abc6-d62711296ca2")
    public void setHwCoolingSupply_Instance_coolingPower(final String value) {
        this.elt.putTagValue(HwCoolingSupplyInstance.MdaTypes.HWCOOLINGSUPPLY_INSTANCE_COOLINGPOWER_TAGTYPE_ELT, value);
    }

    @objid ("5d14a097-d8a0-4a6b-a080-4a8d76bf3613")
    protected HwCoolingSupplyInstance(final Instance elt) {
        super(elt);
    }

    @objid ("ea5d302c-15ba-42a0-a171-668999064a3c")
    public static final class MdaTypes {
        @objid ("99534217-a458-4a0a-a74c-595cf55e33ec")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e81c7876-a3fc-46d9-ae4c-3c26c0fa9e39")
        public static TagType HWCOOLINGSUPPLY_INSTANCE_COOLINGPOWER_TAGTYPE_ELT;

        @objid ("bd586f56-af16-4fc9-883b-f7a394f8f1f9")
        private static Stereotype MDAASSOCDEP;

        @objid ("ada608df-da36-4b56-8f4e-db9410aa13cf")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("94383885-ee16-41a8-9924-acb79762f115")
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
