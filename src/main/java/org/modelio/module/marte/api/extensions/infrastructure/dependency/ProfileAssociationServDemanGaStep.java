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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_servDeman_GaStep >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("68e2e0ba-6996-4232-8108-85a93cf89cbd")
public class ProfileAssociationServDemanGaStep {
    @objid ("ae103b5b-d8fa-46db-b6ca-60c74582c8a8")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_servDeman_GaStep";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("79ebee8a-5230-4027-9aa6-55b30231a7a8")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationServDemanGaStep proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_servDeman_GaStep >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("f486d1f1-a869-4dd6-86ac-25b3c4bf533b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationServDemanGaStep.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_servDeman_GaStep >> then instantiate a {@link ProfileAssociationServDemanGaStep} proxy.
     * 
     * @return a {@link ProfileAssociationServDemanGaStep} proxy on the created {@link Dependency}.
     */
    @objid ("4dd87b17-a14d-4e16-b82f-b2255f5afee5")
    public static ProfileAssociationServDemanGaStep create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationServDemanGaStep.STEREOTYPE_NAME);
        return ProfileAssociationServDemanGaStep.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationServDemanGaStep} proxy from a {@link Dependency} stereotyped << ProfileAssociation_servDeman_GaStep >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationServDemanGaStep} proxy or <i>null</i>.
     */
    @objid ("eb220050-dc81-4dc1-8631-abc44f74e306")
    public static ProfileAssociationServDemanGaStep instantiate(final Dependency obj) {
        return ProfileAssociationServDemanGaStep.canInstantiate(obj) ? new ProfileAssociationServDemanGaStep(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationServDemanGaStep} proxy from a {@link Dependency} stereotyped << ProfileAssociation_servDeman_GaStep >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationServDemanGaStep} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("e4bac874-4447-40d4-b1f1-3cabb7ee50bc")
    public static ProfileAssociationServDemanGaStep safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationServDemanGaStep.canInstantiate(obj))
        	return new ProfileAssociationServDemanGaStep(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationServDemanGaStep: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("14a78360-b9c0-4b2e-b3ec-78ed65e6f292")
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
        ProfileAssociationServDemanGaStep other = (ProfileAssociationServDemanGaStep) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("5df1b910-12bf-4a81-9cd0-d45c235574ee")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("2304079a-541d-40c3-a2bf-2a108e389033")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("7b9e62fb-1299-4f52-ac44-532c1a78fd43")
    protected ProfileAssociationServDemanGaStep(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("4abbb558-f4f6-4664-8c21-fef629877f01")
    public static final class MdaTypes {
        @objid ("17180012-a159-4ec9-a4f9-db7286ea81df")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4fe508d7-574c-4bc2-aba0-246edaa431d0")
        private static Stereotype MDAASSOCDEP;

        @objid ("0515bc01-5e4a-41f9-bb13-75b7621d717d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("78c79e08-27d7-43d9-aff4-0c941fb877aa")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "d06528fd-dd1f-11e0-a2be-0027103f347c");
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
