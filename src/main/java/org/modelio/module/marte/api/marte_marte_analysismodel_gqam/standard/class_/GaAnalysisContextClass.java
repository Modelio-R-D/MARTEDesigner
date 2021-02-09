/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.class_;

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
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_coreelements.standard.class_.ConfigurationClass;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Class} with << GaAnalysisContext_Class >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class GaAnalysisContextClass extends ConfigurationClass {
    public static final String STEREOTYPE_NAME = "GaAnalysisContext_Class";

    public static final String GAANALYSISCONTEXT_CLASS_CONTEXTPARAMS_TAGTYPE = "GaAnalysisContext_Class_contextParams";

    public static final String GAANALYSISCONTEXT_CLASS_PLATFORM_TAGTYPE = "GaAnalysisContext_Class_platform";

    public static final String GAANALYSISCONTEXT_CLASS_WORKLOAD_TAGTYPE = "GaAnalysisContext_Class_workload";

    /**
     * Tells whether a {@link GaAnalysisContextClass proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << GaAnalysisContext_Class >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GaAnalysisContextClass.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << GaAnalysisContext_Class >> then instantiate a {@link GaAnalysisContextClass} proxy.
     * 
     * @return a {@link GaAnalysisContextClass} proxy on the created {@link Class}.
     */
    public static GaAnalysisContextClass create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GaAnalysisContextClass.STEREOTYPE_NAME);
        return GaAnalysisContextClass.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link GaAnalysisContextClass} proxy from a {@link Class} stereotyped << GaAnalysisContext_Class >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link GaAnalysisContextClass} proxy or <i>null</i>.
     */
    public static GaAnalysisContextClass instantiate(final Class obj) {
        return GaAnalysisContextClass.canInstantiate(obj) ? new GaAnalysisContextClass(obj) : null;
    }

    /**
     * Tries to instantiate a {@link GaAnalysisContextClass} proxy from a {@link Class} stereotyped << GaAnalysisContext_Class >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link GaAnalysisContextClass} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static GaAnalysisContextClass safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (GaAnalysisContextClass.canInstantiate(obj))
        	return new GaAnalysisContextClass(obj);
        else
        	throw new IllegalArgumentException("GaAnalysisContextClass: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        GaAnalysisContextClass other = (GaAnalysisContextClass) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for List<String> property 'GaAnalysisContext_Class_contextParams'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaAnalysisContext_Class_contextParams() {
        return this.elt.getTagValues(GaAnalysisContextClass.MdaTypes.GAANALYSISCONTEXT_CLASS_CONTEXTPARAMS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaAnalysisContext_Class_platform'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaAnalysisContext_Class_platform() {
        return this.elt.getTagValues(GaAnalysisContextClass.MdaTypes.GAANALYSISCONTEXT_CLASS_PLATFORM_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaAnalysisContext_Class_workload'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaAnalysisContext_Class_workload() {
        return this.elt.getTagValues(GaAnalysisContextClass.MdaTypes.GAANALYSISCONTEXT_CLASS_WORKLOAD_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'GaAnalysisContext_Class_contextParams'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaAnalysisContext_Class_contextParams(final List<String> values) {
        this.elt.putTagValues(GaAnalysisContextClass.MdaTypes.GAANALYSISCONTEXT_CLASS_CONTEXTPARAMS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaAnalysisContext_Class_platform'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaAnalysisContext_Class_platform(final List<String> values) {
        this.elt.putTagValues(GaAnalysisContextClass.MdaTypes.GAANALYSISCONTEXT_CLASS_PLATFORM_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaAnalysisContext_Class_workload'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaAnalysisContext_Class_workload(final List<String> values) {
        this.elt.putTagValues(GaAnalysisContextClass.MdaTypes.GAANALYSISCONTEXT_CLASS_WORKLOAD_TAGTYPE_ELT, values);
    }

    protected GaAnalysisContextClass(final Class elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType GAANALYSISCONTEXT_CLASS_CONTEXTPARAMS_TAGTYPE_ELT;

        public static TagType GAANALYSISCONTEXT_CLASS_WORKLOAD_TAGTYPE_ELT;

        public static TagType GAANALYSISCONTEXT_CLASS_PLATFORM_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "42937080-149f-11df-9d54-0014222a9f79");
            GAANALYSISCONTEXT_CLASS_CONTEXTPARAMS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "42937081-149f-11df-9d54-0014222a9f79");
            GAANALYSISCONTEXT_CLASS_WORKLOAD_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "42937082-149f-11df-9d54-0014222a9f79");
            GAANALYSISCONTEXT_CLASS_PLATFORM_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "42937083-149f-11df-9d54-0014222a9f79");
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
