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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_dependentScheduler_SchedulableResource_SecondaryScheduler >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("fc4360c4-4785-4a4d-b5ca-c49c7a98df31")
public class ProfileAssociationDependentSchedulerSchedulableResourceSecondaryScheduler {
    @objid ("8341a4b9-7928-480c-a535-b0160c3fda45")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_dependentScheduler_SchedulableResource_SecondaryScheduler";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("87d264db-9dd4-4363-90a7-a70f8108ba46")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationDependentSchedulerSchedulableResourceSecondaryScheduler proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_dependentScheduler_SchedulableResource_SecondaryScheduler >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("d6ec10e3-76b9-49d3-bcdc-82e890b16b33")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationDependentSchedulerSchedulableResourceSecondaryScheduler.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_dependentScheduler_SchedulableResource_SecondaryScheduler >> then instantiate a {@link ProfileAssociationDependentSchedulerSchedulableResourceSecondaryScheduler} proxy.
     * 
     * @return a {@link ProfileAssociationDependentSchedulerSchedulableResourceSecondaryScheduler} proxy on the created {@link Dependency}.
     */
    @objid ("02c48eb9-fc7c-40d7-83e2-f3dbba6d921e")
    public static ProfileAssociationDependentSchedulerSchedulableResourceSecondaryScheduler create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationDependentSchedulerSchedulableResourceSecondaryScheduler.STEREOTYPE_NAME);
        return ProfileAssociationDependentSchedulerSchedulableResourceSecondaryScheduler.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationDependentSchedulerSchedulableResourceSecondaryScheduler} proxy from a {@link Dependency} stereotyped << ProfileAssociation_dependentScheduler_SchedulableResource_SecondaryScheduler >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationDependentSchedulerSchedulableResourceSecondaryScheduler} proxy or <i>null</i>.
     */
    @objid ("01a43ee0-eb3d-4c3f-bd1a-27a368732496")
    public static ProfileAssociationDependentSchedulerSchedulableResourceSecondaryScheduler instantiate(final Dependency obj) {
        return ProfileAssociationDependentSchedulerSchedulableResourceSecondaryScheduler.canInstantiate(obj) ? new ProfileAssociationDependentSchedulerSchedulableResourceSecondaryScheduler(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationDependentSchedulerSchedulableResourceSecondaryScheduler} proxy from a {@link Dependency} stereotyped << ProfileAssociation_dependentScheduler_SchedulableResource_SecondaryScheduler >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationDependentSchedulerSchedulableResourceSecondaryScheduler} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("a76c6761-6571-4874-afae-e2a4608b83f1")
    public static ProfileAssociationDependentSchedulerSchedulableResourceSecondaryScheduler safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationDependentSchedulerSchedulableResourceSecondaryScheduler.canInstantiate(obj))
        	return new ProfileAssociationDependentSchedulerSchedulableResourceSecondaryScheduler(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationDependentSchedulerSchedulableResourceSecondaryScheduler: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("4af869f0-dca2-4c96-8853-38e0dba206e6")
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
        ProfileAssociationDependentSchedulerSchedulableResourceSecondaryScheduler other = (ProfileAssociationDependentSchedulerSchedulableResourceSecondaryScheduler) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("9734f019-e807-432a-abee-ad1afcbccda1")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("8ae2622a-efea-4844-b152-f2f8dbd6a059")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("71094389-04e5-45d5-b94b-f20b6c865c3e")
    protected ProfileAssociationDependentSchedulerSchedulableResourceSecondaryScheduler(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("324124f1-ea89-4d35-acd3-d88479ee04a4")
    public static final class MdaTypes {
        @objid ("2dc8c8d2-7260-4008-a682-f9796bea92dc")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("162c9203-6151-4058-9da2-745d416d82db")
        private static Stereotype MDAASSOCDEP;

        @objid ("8c59e02d-e03b-4fde-9749-aef8821c5a82")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("97089b7b-b445-4fc2-bbe2-b6caba7fb714")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "258e0449-8b69-11df-9343-0014222a9f79");
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
