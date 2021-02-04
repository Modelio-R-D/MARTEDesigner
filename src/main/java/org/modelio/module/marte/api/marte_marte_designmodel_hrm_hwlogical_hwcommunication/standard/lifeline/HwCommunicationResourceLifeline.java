/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
    @objid ("c3685c82-a4ae-44b5-85ac-e70131da0d69")
    public static final String STEREOTYPE_NAME = "HwCommunicationResource_Lifeline";

    /**
     * Tells whether a {@link HwCommunicationResourceLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << HwCommunicationResource_Lifeline >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("cb532acc-d747-4171-ae5b-ebef9a644c6d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwCommunicationResourceLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << HwCommunicationResource_Lifeline >> then instantiate a {@link HwCommunicationResourceLifeline} proxy.
     * 
     * @return a {@link HwCommunicationResourceLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("d1b5f594-48f1-4139-b837-eaa9b8fe158a")
    public static HwCommunicationResourceLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwCommunicationResourceLifeline.STEREOTYPE_NAME);
        return HwCommunicationResourceLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link HwCommunicationResourceLifeline} proxy from a {@link Lifeline} stereotyped << HwCommunicationResource_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link HwCommunicationResourceLifeline} proxy or <i>null</i>.
     */
    @objid ("f6857412-24ee-47b6-b478-a6b8510c1b7c")
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
    @objid ("e39c5166-7ab2-499b-a245-69ae3656f0d2")
    public static HwCommunicationResourceLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (HwCommunicationResourceLifeline.canInstantiate(obj))
        	return new HwCommunicationResourceLifeline(obj);
        else
        	throw new IllegalArgumentException("HwCommunicationResourceLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("4f01cb51-e7a3-40db-8111-15785936eeee")
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
    @objid ("2b9d0010-6349-4e27-aa48-249d80150dfd")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    @objid ("04173c14-7013-48c5-9027-ab20d107c689")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("83da9333-6934-473b-969a-549538943d02")
    protected HwCommunicationResourceLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("29189416-d0c0-414d-b961-3cecd3c690c5")
    public static final class MdaTypes {
        @objid ("d67a790b-b114-4215-ae1d-2cc04ea59f55")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d4d26edd-27f2-4fa8-a078-89ce20a6bfa7")
        private static Stereotype MDAASSOCDEP;

        @objid ("7ecdad1e-6cd5-4cbf-a569-ba0e61820770")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e82d1925-7409-4c98-98ec-6433b57d64d0")
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
