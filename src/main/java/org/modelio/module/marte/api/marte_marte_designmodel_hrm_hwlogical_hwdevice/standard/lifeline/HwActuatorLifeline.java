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
 * Proxy class to handle a {@link Lifeline} with << HwActuator_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("453946c5-e323-4632-ab4a-89421f3c75c1")
public class HwActuatorLifeline extends HwIOLifeline {
    @objid ("3cf3c8af-1a3b-4990-b197-d0909fc729a6")
    public static final String STEREOTYPE_NAME = "HwActuator_Lifeline";

    /**
     * Tells whether a {@link HwActuatorLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << HwActuator_Lifeline >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("cbc97971-8dae-4d93-9519-2d10bbbb5fd4")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwActuatorLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << HwActuator_Lifeline >> then instantiate a {@link HwActuatorLifeline} proxy.
     * 
     * @return a {@link HwActuatorLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("8083dbab-b446-40eb-90b3-96bf5a459858")
    public static HwActuatorLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwActuatorLifeline.STEREOTYPE_NAME);
        return HwActuatorLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link HwActuatorLifeline} proxy from a {@link Lifeline} stereotyped << HwActuator_Lifeline >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link HwActuatorLifeline} proxy or <i>null</i>.
     */
    @objid ("b99ff101-1695-4d64-b3c2-b931b4818b47")
    public static HwActuatorLifeline instantiate(final Lifeline obj) {
        return HwActuatorLifeline.canInstantiate(obj) ? new HwActuatorLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwActuatorLifeline} proxy from a {@link Lifeline} stereotyped << HwActuator_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link HwActuatorLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("a8e237ef-1a58-41be-9c49-fcc0b0e5b98f")
    public static HwActuatorLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (HwActuatorLifeline.canInstantiate(obj))
        	return new HwActuatorLifeline(obj);
        else
        	throw new IllegalArgumentException("HwActuatorLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c0fc9138-1fee-400e-8341-65ba501996cd")
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
        HwActuatorLifeline other = (HwActuatorLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @objid ("3b4a0553-69e4-45f2-bc2c-c4c520a62b91")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    @objid ("1e873283-03b5-41a8-9e9c-01d3d66b8158")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("46a37463-9867-4543-9d67-db4a233189d0")
    protected HwActuatorLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("4f6bea58-813c-41b4-8865-97f73b57298d")
    public static final class MdaTypes {
        @objid ("55c4cedc-beae-4a3e-9b0e-853336dfbe6d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4a0bcceb-eb24-4cce-9a4d-41a06bcc98d8")
        private static Stereotype MDAASSOCDEP;

        @objid ("73b37275-e4df-4c05-9579-183aa74f8819")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("96b1a5fd-c1ea-4104-9148-171bbf4eed12")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "88a37414-c7ac-11df-ad39-001302895b2b");
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
