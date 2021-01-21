/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.lifeline;

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
import org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.lifeline.HwResourceLifeline;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Lifeline} with << HwCommunicationResource_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("d265f9b3-ec1b-4a12-9e6d-036798fd59e0")
public class HwCommunicationResourceLifeline extends HwResourceLifeline {
    @objid ("c7b3e208-4806-4005-b167-6e82c0eb3086")
    public static final String STEREOTYPE_NAME = "HwCommunicationResource_Lifeline";

    /**
     * Tells whether a {@link HwCommunicationResourceLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << HwCommunicationResource_Lifeline >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("ce3aa646-c8e8-4ed9-bdda-aac7994f5f8a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwCommunicationResourceLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << HwCommunicationResource_Lifeline >> then instantiate a {@link HwCommunicationResourceLifeline} proxy.
     * 
     * @return a {@link HwCommunicationResourceLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("6b1a060b-e8c6-40a2-8ffd-48bc37ca25d8")
    public static HwCommunicationResourceLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwCommunicationResourceLifeline.STEREOTYPE_NAME);
        return HwCommunicationResourceLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link HwCommunicationResourceLifeline} proxy from a {@link Lifeline} stereotyped << HwCommunicationResource_Lifeline >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link HwCommunicationResourceLifeline} proxy or <i>null</i>.
     */
    @objid ("7ecc0030-e96a-463b-bcc4-569ab60490eb")
    public static HwCommunicationResourceLifeline instantiate(final Lifeline obj) {
        return HwCommunicationResourceLifeline.canInstantiate(obj) ? new HwCommunicationResourceLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwCommunicationResourceLifeline} proxy from a {@link Lifeline} stereotyped << HwCommunicationResource_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link HwCommunicationResourceLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("1e1437ae-9aa0-4672-bba0-f27063d97e24")
    public static HwCommunicationResourceLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (HwCommunicationResourceLifeline.canInstantiate(obj))
        	return new HwCommunicationResourceLifeline(obj);
        else
        	throw new IllegalArgumentException("HwCommunicationResourceLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("9ce50533-ca4d-4ce7-ada0-321866bb3ff5")
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
        HwCommunicationResourceLifeline other = (HwCommunicationResourceLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @objid ("f754ff29-8d63-429e-a4b5-f82084ada41a")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    @objid ("625faa9e-6f17-49ad-94ef-592324676e4a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("0b7ac7a8-7d63-4d5c-9f34-73c0d99356f9")
    protected HwCommunicationResourceLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("29189416-d0c0-414d-b961-3cecd3c690c5")
    public static final class MdaTypes {
        @objid ("01c3575a-729c-4a56-9ff7-9ff9fb8156b9")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9c3a2be3-5b3c-490d-b182-8445773a8a90")
        private static Stereotype MDAASSOCDEP;

        @objid ("5bf70503-5669-4705-91d1-64ffb8cd22f7")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1fcc742c-40f1-4f51-b90a-6b865fd265cb")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "1875c34c-10ad-11df-81d9-0014222a9f79");
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
