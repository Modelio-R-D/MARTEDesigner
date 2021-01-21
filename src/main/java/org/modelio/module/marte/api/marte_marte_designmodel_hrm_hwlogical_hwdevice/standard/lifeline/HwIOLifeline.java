/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.lifeline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Lifeline} with << HwI_O_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("93808826-d9b4-44b7-b2cc-5c8f2217c5b3")
public class HwIOLifeline extends HwDeviceLifeline {
    @objid ("57b8bec8-c5e4-4114-a644-2cd4673fb90f")
    public static final String STEREOTYPE_NAME = "HwI_O_Lifeline";

    /**
     * Tells whether a {@link HwIOLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << HwI_O_Lifeline >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("80e66fe7-d6e2-4495-a102-a615010aaa3b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwIOLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << HwI_O_Lifeline >> then instantiate a {@link HwIOLifeline} proxy.
     * 
     * @return a {@link HwIOLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("983b9005-05bc-4307-b2d5-f8752220464b")
    public static HwIOLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwIOLifeline.STEREOTYPE_NAME);
        return HwIOLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link HwIOLifeline} proxy from a {@link Lifeline} stereotyped << HwI_O_Lifeline >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link HwIOLifeline} proxy or <i>null</i>.
     */
    @objid ("1509e2de-9e2f-411f-9f1c-eb46840cf847")
    public static HwIOLifeline instantiate(final Lifeline obj) {
        return HwIOLifeline.canInstantiate(obj) ? new HwIOLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwIOLifeline} proxy from a {@link Lifeline} stereotyped << HwI_O_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link HwIOLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("2c30ea03-65ca-4471-9e32-da06b1aa42b0")
    public static HwIOLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (HwIOLifeline.canInstantiate(obj))
        	return new HwIOLifeline(obj);
        else
        	throw new IllegalArgumentException("HwIOLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("5c647fd5-d22f-413b-9bc3-4edda472af47")
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
        HwIOLifeline other = (HwIOLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @objid ("71f86e9a-e956-43c6-a0cf-ef8006e54738")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    @objid ("ac7c3506-9a3d-47ee-86e9-b61dfea823fa")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("059d792a-9b27-4ff4-bff5-14db244aad2e")
    protected HwIOLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("673418bc-8c3c-4d99-97bd-1081f6c7330c")
    public static final class MdaTypes {
        @objid ("b636a52b-f8bf-4daa-895e-333b15f7590c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("43cde3eb-05a1-473f-a8a2-dae219bebaa0")
        private static Stereotype MDAASSOCDEP;

        @objid ("60844327-640c-4f43-bbb2-e16f9fa348ef")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("782233a6-b1d5-49d5-9032-537ca45cf258")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "07f7d121-10b1-11df-81d9-0014222a9f79");
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
