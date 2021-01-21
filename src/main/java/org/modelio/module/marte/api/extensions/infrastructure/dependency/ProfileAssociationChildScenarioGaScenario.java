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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_childScenario_GaScenario >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("184683bc-d17b-4064-b5d7-755a907ad0b5")
public class ProfileAssociationChildScenarioGaScenario {
    @objid ("b71fbcfb-72e6-41fa-8f9b-efcf1cdbd25c")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_childScenario_GaScenario";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("7767439a-eb66-475b-87b9-464660d618e6")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationChildScenarioGaScenario proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_childScenario_GaScenario >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("0924be12-f9f1-443f-a929-6acbdb9b1330")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationChildScenarioGaScenario.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_childScenario_GaScenario >> then instantiate a {@link ProfileAssociationChildScenarioGaScenario} proxy.
     * 
     * @return a {@link ProfileAssociationChildScenarioGaScenario} proxy on the created {@link Dependency}.
     */
    @objid ("16ea3412-8550-4922-bff3-263f4d9e1086")
    public static ProfileAssociationChildScenarioGaScenario create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationChildScenarioGaScenario.STEREOTYPE_NAME);
        return ProfileAssociationChildScenarioGaScenario.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationChildScenarioGaScenario} proxy from a {@link Dependency} stereotyped << ProfileAssociation_childScenario_GaScenario >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationChildScenarioGaScenario} proxy or <i>null</i>.
     */
    @objid ("3ad34e39-bc1d-464e-9a45-0f412eb0ab8a")
    public static ProfileAssociationChildScenarioGaScenario instantiate(final Dependency obj) {
        return ProfileAssociationChildScenarioGaScenario.canInstantiate(obj) ? new ProfileAssociationChildScenarioGaScenario(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationChildScenarioGaScenario} proxy from a {@link Dependency} stereotyped << ProfileAssociation_childScenario_GaScenario >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationChildScenarioGaScenario} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("4407c298-b2b8-41d4-99cb-fc8d5051aac7")
    public static ProfileAssociationChildScenarioGaScenario safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationChildScenarioGaScenario.canInstantiate(obj))
        	return new ProfileAssociationChildScenarioGaScenario(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationChildScenarioGaScenario: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("7b425de9-6576-4142-b768-226a5549ca92")
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
        ProfileAssociationChildScenarioGaScenario other = (ProfileAssociationChildScenarioGaScenario) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("1f861bdc-187a-48f5-a093-8b936eeecce2")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("b9bc0d04-b90a-4393-92d7-c52dd86f90c2")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("54c7167d-4d44-4075-8cfd-c8ecff20ccd7")
    protected ProfileAssociationChildScenarioGaScenario(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("b6a3c392-4ab7-4524-baa3-a70a6680b3c7")
    public static final class MdaTypes {
        @objid ("2378db40-ead5-4b82-8881-3d473191c3c0")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("33dea98e-16e9-4f9e-8fa9-cee701245f52")
        private static Stereotype MDAASSOCDEP;

        @objid ("1e4dd139-2276-4276-8ba4-d646d6c43cb7")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d16b8bdd-1502-4633-a5db-2eddaf496c11")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "48639ccb-9e88-11e1-8c5f-0027103f347d");
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
