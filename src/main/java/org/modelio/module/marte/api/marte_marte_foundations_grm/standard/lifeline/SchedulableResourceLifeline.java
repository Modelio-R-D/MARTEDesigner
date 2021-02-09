/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.lifeline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
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
 * Proxy class to handle a {@link Lifeline} with << SchedulableResource_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class SchedulableResourceLifeline extends ResourceLifeline {
    public static final String STEREOTYPE_NAME = "SchedulableResource_Lifeline";

    public static final String SCHEDULABLERESOURCE_LIFELINE_DEPENDENTSCHEDULER_TAGTYPE = "SchedulableResource_Lifeline_dependentScheduler";

    public static final String SCHEDULABLERESOURCE_LIFELINE_HOST_TAGTYPE = "SchedulableResource_Lifeline_host";

    public static final String SCHEDULABLERESOURCE_LIFELINE_SCHEDPARAMS_TAGTYPE = "SchedulableResource_Lifeline_schedParams";

    /**
     * Tells whether a {@link SchedulableResourceLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << SchedulableResource_Lifeline >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SchedulableResourceLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << SchedulableResource_Lifeline >> then instantiate a {@link SchedulableResourceLifeline} proxy.
     * 
     * @return a {@link SchedulableResourceLifeline} proxy on the created {@link Lifeline}.
     */
    public static SchedulableResourceLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SchedulableResourceLifeline.STEREOTYPE_NAME);
        return SchedulableResourceLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link SchedulableResourceLifeline} proxy from a {@link Lifeline} stereotyped << SchedulableResource_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link SchedulableResourceLifeline} proxy or <i>null</i>.
     */
    public static SchedulableResourceLifeline instantiate(final Lifeline obj) {
        return SchedulableResourceLifeline.canInstantiate(obj) ? new SchedulableResourceLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SchedulableResourceLifeline} proxy from a {@link Lifeline} stereotyped << SchedulableResource_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link SchedulableResourceLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static SchedulableResourceLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (SchedulableResourceLifeline.canInstantiate(obj))
        	return new SchedulableResourceLifeline(obj);
        else
        	throw new IllegalArgumentException("SchedulableResourceLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SchedulableResourceLifeline other = (SchedulableResourceLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for string property 'SchedulableResource_Lifeline_dependentScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSchedulableResource_Lifeline_dependentScheduler() {
        return this.elt.getTagValue(SchedulableResourceLifeline.MdaTypes.SCHEDULABLERESOURCE_LIFELINE_DEPENDENTSCHEDULER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SchedulableResource_Lifeline_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSchedulableResource_Lifeline_host() {
        return this.elt.getTagValue(SchedulableResourceLifeline.MdaTypes.SCHEDULABLERESOURCE_LIFELINE_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SchedulableResource_Lifeline_schedParams'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSchedulableResource_Lifeline_schedParams() {
        return this.elt.getTagValues(SchedulableResourceLifeline.MdaTypes.SCHEDULABLERESOURCE_LIFELINE_SCHEDPARAMS_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'SchedulableResource_Lifeline_dependentScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSchedulableResource_Lifeline_dependentScheduler(final String value) {
        this.elt.putTagValue(SchedulableResourceLifeline.MdaTypes.SCHEDULABLERESOURCE_LIFELINE_DEPENDENTSCHEDULER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SchedulableResource_Lifeline_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSchedulableResource_Lifeline_host(final String value) {
        this.elt.putTagValue(SchedulableResourceLifeline.MdaTypes.SCHEDULABLERESOURCE_LIFELINE_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SchedulableResource_Lifeline_schedParams'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSchedulableResource_Lifeline_schedParams(final List<String> values) {
        this.elt.putTagValues(SchedulableResourceLifeline.MdaTypes.SCHEDULABLERESOURCE_LIFELINE_SCHEDPARAMS_TAGTYPE_ELT, values);
    }

    protected SchedulableResourceLifeline(final Lifeline elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SCHEDULABLERESOURCE_LIFELINE_SCHEDPARAMS_TAGTYPE_ELT;

        public static TagType SCHEDULABLERESOURCE_LIFELINE_HOST_TAGTYPE_ELT;

        public static TagType SCHEDULABLERESOURCE_LIFELINE_DEPENDENTSCHEDULER_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "1bf9e3bc-0f4e-11df-8c52-0014222a9f79");
            SCHEDULABLERESOURCE_LIFELINE_SCHEDPARAMS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "523fb91e-14c6-11df-92f7-001302895b2b");
            SCHEDULABLERESOURCE_LIFELINE_HOST_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "57c7f73a-14c6-11df-92f7-001302895b2b");
            SCHEDULABLERESOURCE_LIFELINE_DEPENDENTSCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5d4dd2f8-14c6-11df-92f7-001302895b2b");
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
