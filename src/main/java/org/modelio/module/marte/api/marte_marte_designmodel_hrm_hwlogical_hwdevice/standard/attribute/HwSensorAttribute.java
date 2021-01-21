/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.attribute;

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
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << HwSensor_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("55af983e-57d3-4533-819e-aab28caab47e")
public class HwSensorAttribute extends HwIOAttribute {
    @objid ("97fe1e7e-87a1-4d78-a4c1-d25f01575718")
    public static final String STEREOTYPE_NAME = "HwSensor_Attribute";

    /**
     * Tells whether a {@link HwSensorAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << HwSensor_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("f215cebd-344e-4fe0-89b1-b3a4ea862211")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwSensorAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << HwSensor_Attribute >> then instantiate a {@link HwSensorAttribute} proxy.
     * 
     * @return a {@link HwSensorAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("7fbeb69a-38ca-450e-a707-6cbb757fb728")
    public static HwSensorAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwSensorAttribute.STEREOTYPE_NAME);
        return HwSensorAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link HwSensorAttribute} proxy from a {@link Attribute} stereotyped << HwSensor_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link HwSensorAttribute} proxy or <i>null</i>.
     */
    @objid ("d85f3a47-4d68-4daf-8edc-0aa8e2310521")
    public static HwSensorAttribute instantiate(final Attribute obj) {
        return HwSensorAttribute.canInstantiate(obj) ? new HwSensorAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwSensorAttribute} proxy from a {@link Attribute} stereotyped << HwSensor_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link HwSensorAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("edcf7521-252d-481d-b7d3-e35ada3ad095")
    public static HwSensorAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (HwSensorAttribute.canInstantiate(obj))
        	return new HwSensorAttribute(obj);
        else
        	throw new IllegalArgumentException("HwSensorAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d1499ba6-f736-4e3e-aee8-0d54add94f37")
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
        HwSensorAttribute other = (HwSensorAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("ef6c6526-62fb-4118-b48a-90a8b3cc75ba")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    @objid ("f1a7b90e-a4af-4b5c-a55e-eab50e5adfd1")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("0b4c62bb-2e0f-4775-9462-b61ad598c5cd")
    protected HwSensorAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("db8c7862-de49-4213-9d60-b9a0fc4bd807")
    public static final class MdaTypes {
        @objid ("c4552e99-dbc6-48da-b3af-1da289e1ed11")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("31f6d27e-68d8-4fa2-a301-e60b748ded5a")
        private static Stereotype MDAASSOCDEP;

        @objid ("d683f597-4a49-4370-ab8b-684f5a8c7fe2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("08c88dc7-56d0-4a14-a3eb-8178163fc897")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "e89de84a-c7ac-11df-ad39-001302895b2b");
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
