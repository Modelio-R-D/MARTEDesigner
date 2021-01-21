/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.association;

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
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << HwSensor_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("60f482b9-58b5-4994-b81d-5323327e31bf")
public class HwSensorAssociation extends HwIOAssociation {
    @objid ("4334227f-ee64-4a49-af89-faf37da63006")
    public static final String STEREOTYPE_NAME = "HwSensor_Association";

    /**
     * Tells whether a {@link HwSensorAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << HwSensor_Association >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("cf54626c-452c-4bc6-884e-3e4439320ae3")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwSensorAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << HwSensor_Association >> then instantiate a {@link HwSensorAssociation} proxy.
     * 
     * @return a {@link HwSensorAssociation} proxy on the created {@link Association}.
     */
    @objid ("a9e50a09-aeaf-4573-9854-cce4b7ffec45")
    public static HwSensorAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwSensorAssociation.STEREOTYPE_NAME);
        return HwSensorAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link HwSensorAssociation} proxy from a {@link Association} stereotyped << HwSensor_Association >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link HwSensorAssociation} proxy or <i>null</i>.
     */
    @objid ("167ae697-c0fe-4f30-962c-47f8d6c98b53")
    public static HwSensorAssociation instantiate(final Association obj) {
        return HwSensorAssociation.canInstantiate(obj) ? new HwSensorAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwSensorAssociation} proxy from a {@link Association} stereotyped << HwSensor_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link HwSensorAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("2f7cd8a0-3228-418a-b509-2d33349216b7")
    public static HwSensorAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (HwSensorAssociation.canInstantiate(obj))
        	return new HwSensorAssociation(obj);
        else
        	throw new IllegalArgumentException("HwSensorAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("8c9ad746-be25-4189-8b3d-77b2519ed537")
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
        HwSensorAssociation other = (HwSensorAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @objid ("d8c40fe9-dc66-44a5-bce5-f5ada0ed2d6f")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    @objid ("e0634aa4-ef55-4aac-bc0c-36286c2c6533")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("95caee26-799a-4b85-8058-2775a5976782")
    protected HwSensorAssociation(final Association elt) {
        super(elt);
    }

    @objid ("4fe07e2a-d9e6-4991-a196-d67e5c3c99ca")
    public static final class MdaTypes {
        @objid ("7bddb6d3-23ce-4a80-a376-a7d45cd6ad7d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("58e83070-f4ee-4358-bb9e-a041ab1167c6")
        private static Stereotype MDAASSOCDEP;

        @objid ("b06a2d9c-bc10-421e-9a1c-d1d1da13cd66")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9240228d-7ec1-4a02-99a6-140194b20a37")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "e89de848-c7ac-11df-ad39-001302895b2b");
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
