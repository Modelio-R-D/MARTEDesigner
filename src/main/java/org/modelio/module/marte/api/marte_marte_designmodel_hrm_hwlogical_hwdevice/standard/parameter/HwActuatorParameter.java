/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.parameter;

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
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Parameter} with << HwActuator_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("d22356eb-f212-4b4b-b30d-fbbc6072d602")
public class HwActuatorParameter extends HwIOParameter {
    @objid ("6689dbd3-ba79-4a50-b6f3-fd2bd1d47b45")
    public static final String STEREOTYPE_NAME = "HwActuator_Parameter";

    /**
     * Tells whether a {@link HwActuatorParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << HwActuator_Parameter >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("e1648cd0-f5d3-4f82-a3ac-90eba5549326")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwActuatorParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << HwActuator_Parameter >> then instantiate a {@link HwActuatorParameter} proxy.
     * 
     * @return a {@link HwActuatorParameter} proxy on the created {@link Parameter}.
     */
    @objid ("a8c9190c-9334-4b8f-98a7-13f4ea7d86a8")
    public static HwActuatorParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwActuatorParameter.STEREOTYPE_NAME);
        return HwActuatorParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link HwActuatorParameter} proxy from a {@link Parameter} stereotyped << HwActuator_Parameter >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link HwActuatorParameter} proxy or <i>null</i>.
     */
    @objid ("127b4697-4e7d-43ea-bcd3-ca4ea3aff103")
    public static HwActuatorParameter instantiate(final Parameter obj) {
        return HwActuatorParameter.canInstantiate(obj) ? new HwActuatorParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwActuatorParameter} proxy from a {@link Parameter} stereotyped << HwActuator_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link HwActuatorParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("6d9bd273-4465-4395-af67-c136ab836210")
    public static HwActuatorParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (HwActuatorParameter.canInstantiate(obj))
        	return new HwActuatorParameter(obj);
        else
        	throw new IllegalArgumentException("HwActuatorParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("bf426e05-d9d2-4a36-9c35-5ec3d28486ca")
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
        HwActuatorParameter other = (HwActuatorParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @objid ("885ad697-c00f-4d8d-8539-3b87fe360355")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    @objid ("f41ac971-9ddf-40f4-869d-60a572884603")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("2cfa1c94-d1f1-4381-bb84-f640b5174221")
    protected HwActuatorParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("73d59287-23a3-40ef-897e-817c49c6856e")
    public static final class MdaTypes {
        @objid ("88713521-004f-4814-82ad-267aba541182")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("17687e0d-375a-4a3c-8d6e-ef73592ba807")
        private static Stereotype MDAASSOCDEP;

        @objid ("fa0bb753-e9af-4a04-97ea-05386912740f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("978383c0-76bd-47f9-b027-0318ff39240f")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "88a37416-c7ac-11df-ad39-001302895b2b");
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
