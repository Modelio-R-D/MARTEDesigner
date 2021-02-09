/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.parameter;

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
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Parameter} with << SchedulableResource_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class SchedulableResourceParameter extends ResourceParameter {
    public static final String STEREOTYPE_NAME = "SchedulableResource_Parameter";

    public static final String SCHEDULABLERESOURCE_PARAMETER_DEPENDENTSCHEDULER_TAGTYPE = "SchedulableResource_Parameter_dependentScheduler";

    public static final String SCHEDULABLERESOURCE_PARAMETER_HOST_TAGTYPE = "SchedulableResource_Parameter_host";

    public static final String SCHEDULABLERESOURCE_PARAMETER_SCHEDPARAMS_TAGTYPE = "SchedulableResource_Parameter_schedParams";

    /**
     * Tells whether a {@link SchedulableResourceParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << SchedulableResource_Parameter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SchedulableResourceParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << SchedulableResource_Parameter >> then instantiate a {@link SchedulableResourceParameter} proxy.
     * 
     * @return a {@link SchedulableResourceParameter} proxy on the created {@link Parameter}.
     */
    public static SchedulableResourceParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SchedulableResourceParameter.STEREOTYPE_NAME);
        return SchedulableResourceParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link SchedulableResourceParameter} proxy from a {@link Parameter} stereotyped << SchedulableResource_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link SchedulableResourceParameter} proxy or <i>null</i>.
     */
    public static SchedulableResourceParameter instantiate(final Parameter obj) {
        return SchedulableResourceParameter.canInstantiate(obj) ? new SchedulableResourceParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SchedulableResourceParameter} proxy from a {@link Parameter} stereotyped << SchedulableResource_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link SchedulableResourceParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static SchedulableResourceParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (SchedulableResourceParameter.canInstantiate(obj))
        	return new SchedulableResourceParameter(obj);
        else
        	throw new IllegalArgumentException("SchedulableResourceParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SchedulableResourceParameter other = (SchedulableResourceParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for string property 'SchedulableResource_Parameter_dependentScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSchedulableResource_Parameter_dependentScheduler() {
        return this.elt.getTagValue(SchedulableResourceParameter.MdaTypes.SCHEDULABLERESOURCE_PARAMETER_DEPENDENTSCHEDULER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SchedulableResource_Parameter_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSchedulableResource_Parameter_host() {
        return this.elt.getTagValue(SchedulableResourceParameter.MdaTypes.SCHEDULABLERESOURCE_PARAMETER_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SchedulableResource_Parameter_schedParams'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSchedulableResource_Parameter_schedParams() {
        return this.elt.getTagValues(SchedulableResourceParameter.MdaTypes.SCHEDULABLERESOURCE_PARAMETER_SCHEDPARAMS_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'SchedulableResource_Parameter_dependentScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSchedulableResource_Parameter_dependentScheduler(final String value) {
        this.elt.putTagValue(SchedulableResourceParameter.MdaTypes.SCHEDULABLERESOURCE_PARAMETER_DEPENDENTSCHEDULER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SchedulableResource_Parameter_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSchedulableResource_Parameter_host(final String value) {
        this.elt.putTagValue(SchedulableResourceParameter.MdaTypes.SCHEDULABLERESOURCE_PARAMETER_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SchedulableResource_Parameter_schedParams'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSchedulableResource_Parameter_schedParams(final List<String> values) {
        this.elt.putTagValues(SchedulableResourceParameter.MdaTypes.SCHEDULABLERESOURCE_PARAMETER_SCHEDPARAMS_TAGTYPE_ELT, values);
    }

    protected SchedulableResourceParameter(final Parameter elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SCHEDULABLERESOURCE_PARAMETER_SCHEDPARAMS_TAGTYPE_ELT;

        public static TagType SCHEDULABLERESOURCE_PARAMETER_HOST_TAGTYPE_ELT;

        public static TagType SCHEDULABLERESOURCE_PARAMETER_DEPENDENTSCHEDULER_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "008c36e2-0ccf-11df-8525-001302895b2b");
            SCHEDULABLERESOURCE_PARAMETER_SCHEDPARAMS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "008e993a-0ccf-11df-8525-001302895b2b");
            SCHEDULABLERESOURCE_PARAMETER_HOST_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0090fb8b-0ccf-11df-8525-001302895b2b");
            SCHEDULABLERESOURCE_PARAMETER_DEPENDENTSCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0090fb92-0ccf-11df-8525-001302895b2b");
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
