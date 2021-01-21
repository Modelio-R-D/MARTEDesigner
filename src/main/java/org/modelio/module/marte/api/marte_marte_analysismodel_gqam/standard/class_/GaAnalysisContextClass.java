/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.class_;

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
@objid ("30697f83-cd56-444a-a385-7eb425b19abc")
public class GaAnalysisContextClass extends ConfigurationClass {
    @objid ("a64a39ef-c622-4cba-bd46-e75c09cb144f")
    public static final String STEREOTYPE_NAME = "GaAnalysisContext_Class";

    @objid ("628c7879-5459-490f-a05f-a7ea18b54527")
    public static final String GAANALYSISCONTEXT_CLASS_CONTEXTPARAMS_TAGTYPE = "GaAnalysisContext_Class_contextParams";

    @objid ("51c640ec-9520-4b48-b7ca-e51e1aa974c1")
    public static final String GAANALYSISCONTEXT_CLASS_PLATFORM_TAGTYPE = "GaAnalysisContext_Class_platform";

    @objid ("dcc52c6c-16e2-4340-b262-1ece404aad2d")
    public static final String GAANALYSISCONTEXT_CLASS_WORKLOAD_TAGTYPE = "GaAnalysisContext_Class_workload";

    /**
     * Tells whether a {@link GaAnalysisContextClass proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << GaAnalysisContext_Class >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("7208895c-dfb1-4c5b-a7aa-e9ee0462fc74")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GaAnalysisContextClass.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << GaAnalysisContext_Class >> then instantiate a {@link GaAnalysisContextClass} proxy.
     * 
     * @return a {@link GaAnalysisContextClass} proxy on the created {@link Class}.
     */
    @objid ("bf0792fd-1931-4540-866c-7a3013c17e70")
    public static GaAnalysisContextClass create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Class");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GaAnalysisContextClass.STEREOTYPE_NAME);
        return GaAnalysisContextClass.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link GaAnalysisContextClass} proxy from a {@link Class} stereotyped << GaAnalysisContext_Class >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link GaAnalysisContextClass} proxy or <i>null</i>.
     */
    @objid ("66a4cb59-af78-436f-ab56-752a0e53d8c8")
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
    @objid ("d0c86e91-bcaa-444b-a7ff-27eb4d32fe1b")
    public static GaAnalysisContextClass safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (GaAnalysisContextClass.canInstantiate(obj))
        	return new GaAnalysisContextClass(obj);
        else
        	throw new IllegalArgumentException("GaAnalysisContextClass: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("2d21076d-cded-4d0d-82f6-0a97e1d57225")
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
    @objid ("1ca44997-aad2-447d-b353-5be8e532d36b")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for List<String> property 'GaAnalysisContext_Class_contextParams'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("b5de3bd1-7724-4959-9076-014ba1ae78bb")
    public List<String> getGaAnalysisContext_Class_contextParams() {
        return this.elt.getTagValues(GaAnalysisContextClass.MdaTypes.GAANALYSISCONTEXT_CLASS_CONTEXTPARAMS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaAnalysisContext_Class_platform'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("53e9c34b-7a89-43ad-b0e7-7b8fe3ccd943")
    public List<String> getGaAnalysisContext_Class_platform() {
        return this.elt.getTagValues(GaAnalysisContextClass.MdaTypes.GAANALYSISCONTEXT_CLASS_PLATFORM_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaAnalysisContext_Class_workload'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("21309708-a9fa-4860-9cb6-e0b7c0d813bd")
    public List<String> getGaAnalysisContext_Class_workload() {
        return this.elt.getTagValues(GaAnalysisContextClass.MdaTypes.GAANALYSISCONTEXT_CLASS_WORKLOAD_TAGTYPE_ELT);
    }

    @objid ("2c34dd61-ed66-4083-8c96-b479f939fa99")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'GaAnalysisContext_Class_contextParams'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8af5d93c-7f74-4cf8-a24b-e6b6323f5578")
    public void setGaAnalysisContext_Class_contextParams(final List<String> values) {
        this.elt.putTagValues(GaAnalysisContextClass.MdaTypes.GAANALYSISCONTEXT_CLASS_CONTEXTPARAMS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaAnalysisContext_Class_platform'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("338ec84c-8369-4f1e-aa6b-9d1fe8cf4a58")
    public void setGaAnalysisContext_Class_platform(final List<String> values) {
        this.elt.putTagValues(GaAnalysisContextClass.MdaTypes.GAANALYSISCONTEXT_CLASS_PLATFORM_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaAnalysisContext_Class_workload'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4e07764e-10a7-44ed-951d-7c95566b82c6")
    public void setGaAnalysisContext_Class_workload(final List<String> values) {
        this.elt.putTagValues(GaAnalysisContextClass.MdaTypes.GAANALYSISCONTEXT_CLASS_WORKLOAD_TAGTYPE_ELT, values);
    }

    @objid ("e09e12f7-dabe-4089-8929-927348ab2c6a")
    protected GaAnalysisContextClass(final Class elt) {
        super(elt);
    }

    @objid ("b0d7061b-c1ac-4e62-910e-c3d4bbc0dd28")
    public static final class MdaTypes {
        @objid ("afa479d5-a023-4df1-884a-27343206045b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("edc01bcd-93f1-4c59-93ed-7c3f41db8567")
        public static TagType GAANALYSISCONTEXT_CLASS_CONTEXTPARAMS_TAGTYPE_ELT;

        @objid ("bd34df02-5ffb-4d13-abad-07d34888765b")
        public static TagType GAANALYSISCONTEXT_CLASS_WORKLOAD_TAGTYPE_ELT;

        @objid ("25112be9-c099-4634-9269-9e36629f5ab7")
        public static TagType GAANALYSISCONTEXT_CLASS_PLATFORM_TAGTYPE_ELT;

        @objid ("b8056e7f-fab7-41ce-8867-af2c174e26ac")
        private static Stereotype MDAASSOCDEP;

        @objid ("a18fd814-d7bf-48e4-a1a9-49e37fe6181d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b76ac778-f7fd-4267-ad96-c896d7686c39")
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
