/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.association;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
 * Proxy class to handle a {@link Association} with << SchedulableResource_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("3556aef2-457d-44cf-b822-c770dabf0722")
public class SchedulableResourceAssociation extends ResourceAssociation {
    @objid ("8900eb17-af75-4c2d-836a-28bfc0fe2757")
    public static final String STEREOTYPE_NAME = "SchedulableResource_Association";

    @objid ("c9994d77-b12f-4e01-a69e-5b90f466e2fa")
    public static final String SCHEDULABLERESOURCE_ASSOCIATION_DEPENDENTSCHEDULER_TAGTYPE = "SchedulableResource_Association_dependentScheduler";

    @objid ("d95395eb-652c-4aee-a0f3-968d5bbe7ea9")
    public static final String SCHEDULABLERESOURCE_ASSOCIATION_HOST_TAGTYPE = "SchedulableResource_Association_host";

    @objid ("0297e047-90cf-40f5-aa2f-2c8dd467e918")
    public static final String SCHEDULABLERESOURCE_ASSOCIATION_SCHEDPARAMS_TAGTYPE = "SchedulableResource_Association_schedParams";

    /**
     * Tells whether a {@link SchedulableResourceAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << SchedulableResource_Association >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("d145024f-54df-4138-90c3-6fe5f93c29d8")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SchedulableResourceAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << SchedulableResource_Association >> then instantiate a {@link SchedulableResourceAssociation} proxy.
     * 
     * @return a {@link SchedulableResourceAssociation} proxy on the created {@link Association}.
     */
    @objid ("725ba31b-0a7b-4f1f-87eb-5415f4f09be1")
    public static SchedulableResourceAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SchedulableResourceAssociation.STEREOTYPE_NAME);
        return SchedulableResourceAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link SchedulableResourceAssociation} proxy from a {@link Association} stereotyped << SchedulableResource_Association >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link SchedulableResourceAssociation} proxy or <i>null</i>.
     */
    @objid ("64be4797-1693-4ea9-b61d-2b5f7ddf0304")
    public static SchedulableResourceAssociation instantiate(final Association obj) {
        return SchedulableResourceAssociation.canInstantiate(obj) ? new SchedulableResourceAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SchedulableResourceAssociation} proxy from a {@link Association} stereotyped << SchedulableResource_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link SchedulableResourceAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("5cd961e3-d50f-4c68-9423-52a313e5a620")
    public static SchedulableResourceAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (SchedulableResourceAssociation.canInstantiate(obj))
        	return new SchedulableResourceAssociation(obj);
        else
        	throw new IllegalArgumentException("SchedulableResourceAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("22ca3196-809a-4134-be6d-0a7f5c176771")
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
        SchedulableResourceAssociation other = (SchedulableResourceAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @objid ("84f6b315-9952-4ed1-8bb2-3d21cd969f9a")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for string property 'SchedulableResource_Association_dependentScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9002e197-6357-4c54-9a64-e0b345ca7ffa")
    public String getSchedulableResource_Association_dependentScheduler() {
        return this.elt.getTagValue(SchedulableResourceAssociation.MdaTypes.SCHEDULABLERESOURCE_ASSOCIATION_DEPENDENTSCHEDULER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SchedulableResource_Association_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d70bb9ce-fcbc-4912-b763-6893e5fcde12")
    public String getSchedulableResource_Association_host() {
        return this.elt.getTagValue(SchedulableResourceAssociation.MdaTypes.SCHEDULABLERESOURCE_ASSOCIATION_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SchedulableResource_Association_schedParams'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("939cdb6f-7029-4700-8aed-b4fb555c2dcc")
    public List<String> getSchedulableResource_Association_schedParams() {
        return this.elt.getTagValues(SchedulableResourceAssociation.MdaTypes.SCHEDULABLERESOURCE_ASSOCIATION_SCHEDPARAMS_TAGTYPE_ELT);
    }

    @objid ("3e524f5c-5ed5-498f-a941-c8ac09ab4f86")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'SchedulableResource_Association_dependentScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e2fbdb59-ac90-45ad-9530-3e82d51b8190")
    public void setSchedulableResource_Association_dependentScheduler(final String value) {
        this.elt.putTagValue(SchedulableResourceAssociation.MdaTypes.SCHEDULABLERESOURCE_ASSOCIATION_DEPENDENTSCHEDULER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SchedulableResource_Association_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3d8eab9d-50d6-40c2-b4b0-946350689ba9")
    public void setSchedulableResource_Association_host(final String value) {
        this.elt.putTagValue(SchedulableResourceAssociation.MdaTypes.SCHEDULABLERESOURCE_ASSOCIATION_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SchedulableResource_Association_schedParams'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5a4d217c-1bfa-468e-a8fd-095394e3a1bc")
    public void setSchedulableResource_Association_schedParams(final List<String> values) {
        this.elt.putTagValues(SchedulableResourceAssociation.MdaTypes.SCHEDULABLERESOURCE_ASSOCIATION_SCHEDPARAMS_TAGTYPE_ELT, values);
    }

    @objid ("f73e0d7d-9072-458b-bfc4-cb294ba0de01")
    protected SchedulableResourceAssociation(final Association elt) {
        super(elt);
    }

    @objid ("d5457d09-de4f-4b36-b2cf-067a2aadb308")
    public static final class MdaTypes {
        @objid ("4b94dfcb-3bca-47cd-b074-7ebd69e42110")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a150bea6-cc72-4443-abca-e10d552d98bf")
        public static TagType SCHEDULABLERESOURCE_ASSOCIATION_SCHEDPARAMS_TAGTYPE_ELT;

        @objid ("d27a2d96-6cca-4d2e-8458-5c9ce4bd29c9")
        public static TagType SCHEDULABLERESOURCE_ASSOCIATION_HOST_TAGTYPE_ELT;

        @objid ("ef34b1b0-1439-45f4-94ea-ea4f9d50bdfa")
        public static TagType SCHEDULABLERESOURCE_ASSOCIATION_DEPENDENTSCHEDULER_TAGTYPE_ELT;

        @objid ("bba39b2d-0c24-4e93-a816-cd9c9e9a4205")
        private static Stereotype MDAASSOCDEP;

        @objid ("4bd5f1ca-f2a2-4a75-88ca-6043d1d56845")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c0209901-335b-43e6-b1d1-c53df2ea4a46")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0d5cef3b-0f4e-11df-8c52-0014222a9f79");
            SCHEDULABLERESOURCE_ASSOCIATION_SCHEDPARAMS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4fe48238-14c6-11df-92f7-001302895b2b");
            SCHEDULABLERESOURCE_ASSOCIATION_HOST_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5683b54a-14c6-11df-92f7-001302895b2b");
            SCHEDULABLERESOURCE_ASSOCIATION_DEPENDENTSCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5bd51cf4-14c6-11df-92f7-001302895b2b");
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
