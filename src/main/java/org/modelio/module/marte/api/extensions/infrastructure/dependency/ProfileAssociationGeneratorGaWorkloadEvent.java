/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_generator_GaWorkloadEvent >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("23d3445f-fd56-4756-b282-1b0a97c6ceba")
public class ProfileAssociationGeneratorGaWorkloadEvent {
    @objid ("d45e38a5-84c4-478f-bdab-dbe098207875")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_generator_GaWorkloadEvent";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("f6df5a4d-2e5d-41d0-973f-0c4556558c55")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationGeneratorGaWorkloadEvent proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_generator_GaWorkloadEvent >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("253e127f-01b0-42e7-97ba-560bb0a2077b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationGeneratorGaWorkloadEvent.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_generator_GaWorkloadEvent >> then instantiate a {@link ProfileAssociationGeneratorGaWorkloadEvent} proxy.
     * 
     * @return a {@link ProfileAssociationGeneratorGaWorkloadEvent} proxy on the created {@link Dependency}.
     */
    @objid ("1c29beac-7cbb-46ce-abef-e2a8708f03a0")
    public static ProfileAssociationGeneratorGaWorkloadEvent create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationGeneratorGaWorkloadEvent.STEREOTYPE_NAME);
        return ProfileAssociationGeneratorGaWorkloadEvent.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationGeneratorGaWorkloadEvent} proxy from a {@link Dependency} stereotyped << ProfileAssociation_generator_GaWorkloadEvent >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationGeneratorGaWorkloadEvent} proxy or <i>null</i>.
     */
    @objid ("5854d18b-c6f8-4439-b790-796c124c92e9")
    public static ProfileAssociationGeneratorGaWorkloadEvent instantiate(final Dependency obj) {
        return ProfileAssociationGeneratorGaWorkloadEvent.canInstantiate(obj) ? new ProfileAssociationGeneratorGaWorkloadEvent(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationGeneratorGaWorkloadEvent} proxy from a {@link Dependency} stereotyped << ProfileAssociation_generator_GaWorkloadEvent >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationGeneratorGaWorkloadEvent} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("b5fb7160-17f1-4e8f-b015-bcf08422be8e")
    public static ProfileAssociationGeneratorGaWorkloadEvent safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationGeneratorGaWorkloadEvent.canInstantiate(obj))
        	return new ProfileAssociationGeneratorGaWorkloadEvent(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationGeneratorGaWorkloadEvent: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b9da08fb-a6af-4f72-acf8-76a55792f32c")
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
        ProfileAssociationGeneratorGaWorkloadEvent other = (ProfileAssociationGeneratorGaWorkloadEvent) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("f40fa212-cf59-40dc-82e3-0c79df8fbe8c")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("1bd7638b-3f7f-45c1-9b96-11e998a39819")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("2c143308-2eef-48ea-babf-bea8f2d71eaf")
    protected ProfileAssociationGeneratorGaWorkloadEvent(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("451fd643-d609-489e-a5b5-6c0dc474d6ba")
    public static final class MdaTypes {
        @objid ("399ae636-9727-4d74-b2ed-074235691b73")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2cf8a59c-22c6-4820-92c2-ac561a63b870")
        private static Stereotype MDAASSOCDEP;

        @objid ("de7a6479-9fb4-419f-af79-d41953d13137")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0c76c457-4152-42a0-90bb-2e6865672c59")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "cf93afa5-dd1f-11e0-a2be-0027103f347c");
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
