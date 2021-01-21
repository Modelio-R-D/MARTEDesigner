/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.extensions.infrastructure.dependency;

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
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_acqRes_GaAcqStep >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("1b102348-793b-4490-ae22-3e45dc6d3d35")
public class ProfileAssociationAcqResGaAcqStep {
    @objid ("40c9930e-60cf-49bd-ae37-5f049d30b7d2")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_acqRes_GaAcqStep";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("0f68a3d5-9eea-4aef-aea5-f88b516f179d")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationAcqResGaAcqStep proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_acqRes_GaAcqStep >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("6f2e6e12-2586-4807-acbf-838e8598d52b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationAcqResGaAcqStep.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_acqRes_GaAcqStep >> then instantiate a {@link ProfileAssociationAcqResGaAcqStep} proxy.
     * 
     * @return a {@link ProfileAssociationAcqResGaAcqStep} proxy on the created {@link Dependency}.
     */
    @objid ("08f5c09b-747e-4a16-a09a-0d8889e28fb3")
    public static ProfileAssociationAcqResGaAcqStep create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationAcqResGaAcqStep.STEREOTYPE_NAME);
        return ProfileAssociationAcqResGaAcqStep.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationAcqResGaAcqStep} proxy from a {@link Dependency} stereotyped << ProfileAssociation_acqRes_GaAcqStep >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationAcqResGaAcqStep} proxy or <i>null</i>.
     */
    @objid ("be9a4ffa-4840-43aa-9725-9c7361de0170")
    public static ProfileAssociationAcqResGaAcqStep instantiate(final Dependency obj) {
        return ProfileAssociationAcqResGaAcqStep.canInstantiate(obj) ? new ProfileAssociationAcqResGaAcqStep(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationAcqResGaAcqStep} proxy from a {@link Dependency} stereotyped << ProfileAssociation_acqRes_GaAcqStep >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationAcqResGaAcqStep} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("54df7413-47d3-4a33-abd8-5009148d31fa")
    public static ProfileAssociationAcqResGaAcqStep safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationAcqResGaAcqStep.canInstantiate(obj))
        	return new ProfileAssociationAcqResGaAcqStep(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationAcqResGaAcqStep: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("451f2be3-0c73-4d6a-90ca-20cd50ed3efe")
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
        ProfileAssociationAcqResGaAcqStep other = (ProfileAssociationAcqResGaAcqStep) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("da9783b2-d8eb-4a1b-b0cf-b05f3ff5fccb")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("41fcd733-12a8-4406-ad5f-eb2886d7b197")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("1b953554-505d-42e3-89fd-f996882a01c7")
    protected ProfileAssociationAcqResGaAcqStep(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("32c583db-b8c6-4412-a4dd-4bf77e93bc20")
    public static final class MdaTypes {
        @objid ("0bc6cae6-0fb4-48be-a1c1-d9e2aabed494")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("cec77469-7da2-4708-bbf8-187886d7fcfc")
        private static Stereotype MDAASSOCDEP;

        @objid ("d0945629-fcc5-451e-95a6-9e96bc209a48")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e94c826e-84f3-424f-8b34-a07711026b32")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "d09e4a15-dd1f-11e0-a2be-0027103f347c");
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
