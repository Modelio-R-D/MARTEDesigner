/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.classifier;

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
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Classifier} with << HwCache_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("0cb64ea2-bb32-49dc-8139-fafb642c6cc2")
public class HwCacheClassifier extends HwMemoryClassifier {
    @objid ("d58aaf11-3e0a-4054-afad-8f1365fb8410")
    public static final String STEREOTYPE_NAME = "HwCache_Classifier";

    @objid ("f2128fdc-6cab-473f-b1c8-30b75af48213")
    public static final String HWCACHE_CLASSIFIER_LEVEL_TAGTYPE = "HwCache_Classifier_level";

    @objid ("02bbbcbe-b89e-4a8d-8b2e-c95c07c9a6db")
    public static final String HWCACHE_CLASSIFIER_REPL_POLICY_TAGTYPE = "HwCache_Classifier_repl_Policy";

    @objid ("73362ddd-b046-46c7-a8e3-44ed166863ea")
    public static final String HWCACHE_CLASSIFIER_STRUCTURE_TAGTYPE = "HwCache_Classifier_structure";

    @objid ("5ea342b4-af52-4954-9f90-076a7cef1545")
    public static final String HWCACHE_CLASSIFIER_TYPE_TAGTYPE = "HwCache_Classifier_type";

    @objid ("c355c3af-72c5-4d02-8fbe-23ea54c73d96")
    public static final String HWCACHE_CLASSIFIER_WRITEPOLICY_TAGTYPE = "HwCache_Classifier_writePolicy";

    /**
     * Tells whether a {@link HwCacheClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << HwCache_Classifier >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("0458f1cb-0c58-4b45-8e84-55d4b2248006")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwCacheClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << HwCache_Classifier >> then instantiate a {@link HwCacheClassifier} proxy.
     * 
     * @return a {@link HwCacheClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("ea8d0f81-ba17-4922-8430-18f298a7dcfa")
    public static HwCacheClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwCacheClassifier.STEREOTYPE_NAME);
        return HwCacheClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link HwCacheClassifier} proxy from a {@link Classifier} stereotyped << HwCache_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link HwCacheClassifier} proxy or <i>null</i>.
     */
    @objid ("74a2e624-ad92-4a61-b7e0-0f38a7d553cf")
    public static HwCacheClassifier instantiate(final Classifier obj) {
        return HwCacheClassifier.canInstantiate(obj) ? new HwCacheClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwCacheClassifier} proxy from a {@link Classifier} stereotyped << HwCache_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link HwCacheClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("07dce4af-0e40-4bf0-85ba-838c9da66de7")
    public static HwCacheClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (HwCacheClassifier.canInstantiate(obj))
        	return new HwCacheClassifier(obj);
        else
        	throw new IllegalArgumentException("HwCacheClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("0dddfebf-7200-46da-88ba-e39578ebb911")
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
        HwCacheClassifier other = (HwCacheClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @objid ("a66f40ed-a1e7-4ac0-aa5b-0bf9431aebe0")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for string property 'HwCache_Classifier_level'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("24cd743d-8d30-4869-8a33-4747db2752f7")
    public String getHwCache_Classifier_level() {
        return this.elt.getTagValue(HwCacheClassifier.MdaTypes.HWCACHE_CLASSIFIER_LEVEL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwCache_Classifier_repl_Policy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("147668db-b85e-46ce-ac26-468826bf178e")
    public String getHwCache_Classifier_repl_Policy() {
        return this.elt.getTagValue(HwCacheClassifier.MdaTypes.HWCACHE_CLASSIFIER_REPL_POLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwCache_Classifier_structure'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("42cbe38f-12bf-4e98-9c35-86d8a846a3b4")
    public String getHwCache_Classifier_structure() {
        return this.elt.getTagValue(HwCacheClassifier.MdaTypes.HWCACHE_CLASSIFIER_STRUCTURE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwCache_Classifier_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("86361f8e-dfc8-407e-869f-ba57dd773c61")
    public String getHwCache_Classifier_type() {
        return this.elt.getTagValue(HwCacheClassifier.MdaTypes.HWCACHE_CLASSIFIER_TYPE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwCache_Classifier_writePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3ff141f6-6324-4da9-8e23-44c2b80635c1")
    public String getHwCache_Classifier_writePolicy() {
        return this.elt.getTagValue(HwCacheClassifier.MdaTypes.HWCACHE_CLASSIFIER_WRITEPOLICY_TAGTYPE_ELT);
    }

    @objid ("2aaebabb-f094-480f-a607-7830783ad33d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwCache_Classifier_level'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a8464fe3-3514-4098-97b4-646ea4731707")
    public void setHwCache_Classifier_level(final String value) {
        this.elt.putTagValue(HwCacheClassifier.MdaTypes.HWCACHE_CLASSIFIER_LEVEL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwCache_Classifier_repl_Policy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e1046c5b-0baa-4ffb-b4cd-8759ec7a0c44")
    public void setHwCache_Classifier_repl_Policy(final String value) {
        this.elt.putTagValue(HwCacheClassifier.MdaTypes.HWCACHE_CLASSIFIER_REPL_POLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwCache_Classifier_structure'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b9599475-4a1d-4a2e-a33f-b3f1dfb471be")
    public void setHwCache_Classifier_structure(final String value) {
        this.elt.putTagValue(HwCacheClassifier.MdaTypes.HWCACHE_CLASSIFIER_STRUCTURE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwCache_Classifier_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6924dec3-8c8f-4f37-be7a-57b19f3705f9")
    public void setHwCache_Classifier_type(final String value) {
        this.elt.putTagValue(HwCacheClassifier.MdaTypes.HWCACHE_CLASSIFIER_TYPE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwCache_Classifier_writePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("76876087-6d15-4d2a-a57d-eb106ce080fc")
    public void setHwCache_Classifier_writePolicy(final String value) {
        this.elt.putTagValue(HwCacheClassifier.MdaTypes.HWCACHE_CLASSIFIER_WRITEPOLICY_TAGTYPE_ELT, value);
    }

    @objid ("6d4f9b1d-4eb1-47a9-bc41-2dd13a62ca08")
    protected HwCacheClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("528a2d73-20d3-4394-8867-cb0e288d9ed8")
    public static final class MdaTypes {
        @objid ("fbc7473f-f80b-4d1d-8d8f-f05c193c0ba0")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7c1879ee-1c2d-49e7-a46f-6664362e0bda")
        public static TagType HWCACHE_CLASSIFIER_LEVEL_TAGTYPE_ELT;

        @objid ("a45f11c2-9259-4b00-8ab0-6a6a5a989f67")
        public static TagType HWCACHE_CLASSIFIER_TYPE_TAGTYPE_ELT;

        @objid ("15d00804-4341-45de-9c27-7d4d8029fe6f")
        public static TagType HWCACHE_CLASSIFIER_STRUCTURE_TAGTYPE_ELT;

        @objid ("0d53f2fc-d39e-4e4c-a925-3f9d523d0bf0")
        public static TagType HWCACHE_CLASSIFIER_REPL_POLICY_TAGTYPE_ELT;

        @objid ("a769b005-a3c3-4410-8bb4-3b4ce14ff3d3")
        public static TagType HWCACHE_CLASSIFIER_WRITEPOLICY_TAGTYPE_ELT;

        @objid ("a4be058d-1e2e-48c6-bd0e-bd6a002bedbd")
        private static Stereotype MDAASSOCDEP;

        @objid ("28c3a57f-2e67-407f-87c0-040e25dbb846")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("01029993-7dc1-4ee1-9d43-ae5c310f3be4")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "75e85000-1006-11df-86fe-0014222a9f79");
            HWCACHE_CLASSIFIER_LEVEL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "41af4c98-1007-11df-86fe-0014222a9f79");
            HWCACHE_CLASSIFIER_TYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "41af4c99-1007-11df-86fe-0014222a9f79");
            HWCACHE_CLASSIFIER_STRUCTURE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "41af4c9a-1007-11df-86fe-0014222a9f79");
            HWCACHE_CLASSIFIER_REPL_POLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "41af4c9b-1007-11df-86fe-0014222a9f79");
            HWCACHE_CLASSIFIER_WRITEPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "41af4c9c-1007-11df-86fe-0014222a9f79");
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
