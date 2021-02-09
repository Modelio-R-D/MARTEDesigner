/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.association;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
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
public class SchedulableResourceAssociation extends ResourceAssociation {
    public static final String STEREOTYPE_NAME = "SchedulableResource_Association";

    public static final String SCHEDULABLERESOURCE_ASSOCIATION_DEPENDENTSCHEDULER_TAGTYPE = "SchedulableResource_Association_dependentScheduler";

    public static final String SCHEDULABLERESOURCE_ASSOCIATION_HOST_TAGTYPE = "SchedulableResource_Association_host";

    public static final String SCHEDULABLERESOURCE_ASSOCIATION_SCHEDPARAMS_TAGTYPE = "SchedulableResource_Association_schedParams";

    /**
     * Tells whether a {@link SchedulableResourceAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << SchedulableResource_Association >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SchedulableResourceAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << SchedulableResource_Association >> then instantiate a {@link SchedulableResourceAssociation} proxy.
     * 
     * @return a {@link SchedulableResourceAssociation} proxy on the created {@link Association}.
     */
    public static SchedulableResourceAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SchedulableResourceAssociation.STEREOTYPE_NAME);
        return SchedulableResourceAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link SchedulableResourceAssociation} proxy from a {@link Association} stereotyped << SchedulableResource_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link SchedulableResourceAssociation} proxy or <i>null</i>.
     */
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
    public static SchedulableResourceAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (SchedulableResourceAssociation.canInstantiate(obj))
        	return new SchedulableResourceAssociation(obj);
        else
        	throw new IllegalArgumentException("SchedulableResourceAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

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
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for string property 'SchedulableResource_Association_dependentScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSchedulableResource_Association_dependentScheduler() {
        return this.elt.getTagValue(SchedulableResourceAssociation.MdaTypes.SCHEDULABLERESOURCE_ASSOCIATION_DEPENDENTSCHEDULER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SchedulableResource_Association_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSchedulableResource_Association_host() {
        return this.elt.getTagValue(SchedulableResourceAssociation.MdaTypes.SCHEDULABLERESOURCE_ASSOCIATION_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SchedulableResource_Association_schedParams'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSchedulableResource_Association_schedParams() {
        return this.elt.getTagValues(SchedulableResourceAssociation.MdaTypes.SCHEDULABLERESOURCE_ASSOCIATION_SCHEDPARAMS_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'SchedulableResource_Association_dependentScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSchedulableResource_Association_dependentScheduler(final String value) {
        this.elt.putTagValue(SchedulableResourceAssociation.MdaTypes.SCHEDULABLERESOURCE_ASSOCIATION_DEPENDENTSCHEDULER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SchedulableResource_Association_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSchedulableResource_Association_host(final String value) {
        this.elt.putTagValue(SchedulableResourceAssociation.MdaTypes.SCHEDULABLERESOURCE_ASSOCIATION_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SchedulableResource_Association_schedParams'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSchedulableResource_Association_schedParams(final List<String> values) {
        this.elt.putTagValues(SchedulableResourceAssociation.MdaTypes.SCHEDULABLERESOURCE_ASSOCIATION_SCHEDPARAMS_TAGTYPE_ELT, values);
    }

    protected SchedulableResourceAssociation(final Association elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SCHEDULABLERESOURCE_ASSOCIATION_SCHEDPARAMS_TAGTYPE_ELT;

        public static TagType SCHEDULABLERESOURCE_ASSOCIATION_HOST_TAGTYPE_ELT;

        public static TagType SCHEDULABLERESOURCE_ASSOCIATION_DEPENDENTSCHEDULER_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
