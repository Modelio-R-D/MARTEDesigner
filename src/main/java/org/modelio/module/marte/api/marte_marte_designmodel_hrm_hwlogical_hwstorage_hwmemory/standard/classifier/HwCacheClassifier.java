/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
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
    @objid ("994d23e2-54f4-481d-8956-cff56cb7f9ee")
    public static final String STEREOTYPE_NAME = "HwCache_Classifier";

    @objid ("90bb26e7-7c67-4463-a962-e3838cc19e61")
    public static final String HWCACHE_CLASSIFIER_LEVEL_TAGTYPE = "HwCache_Classifier_level";

    @objid ("efc19eac-bc47-47c7-a038-bfecfcc76d41")
    public static final String HWCACHE_CLASSIFIER_REPL_POLICY_TAGTYPE = "HwCache_Classifier_repl_Policy";

    @objid ("823c5f29-76e1-40c1-a7a1-3527a88de841")
    public static final String HWCACHE_CLASSIFIER_STRUCTURE_TAGTYPE = "HwCache_Classifier_structure";

    @objid ("558492a4-7fc0-4052-8b06-0080b12d5279")
    public static final String HWCACHE_CLASSIFIER_TYPE_TAGTYPE = "HwCache_Classifier_type";

    @objid ("520115c4-780e-45f7-a411-6d6a44f43a6b")
    public static final String HWCACHE_CLASSIFIER_WRITEPOLICY_TAGTYPE = "HwCache_Classifier_writePolicy";

    /**
     * Tells whether a {@link HwCacheClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << HwCache_Classifier >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("518a126e-3326-48a8-bbf9-c2d8bddf643b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwCacheClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << HwCache_Classifier >> then instantiate a {@link HwCacheClassifier} proxy.
     * 
     * @return a {@link HwCacheClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("3be90be1-9dfd-48e4-87fd-233e795d1545")
    public static HwCacheClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwCacheClassifier.STEREOTYPE_NAME);
        return HwCacheClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link HwCacheClassifier} proxy from a {@link Classifier} stereotyped << HwCache_Classifier >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link HwCacheClassifier} proxy or <i>null</i>.
     */
    @objid ("420ada40-1494-482c-a344-1ccba8ddbbfd")
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
    @objid ("36b53e6d-2a3e-4dd6-8b82-821016730f5f")
    public static HwCacheClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (HwCacheClassifier.canInstantiate(obj))
        	return new HwCacheClassifier(obj);
        else
        	throw new IllegalArgumentException("HwCacheClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d373e9a5-1f7f-4109-9b82-11e08301b8e2")
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
    @objid ("c928776e-a6e8-4cff-9d09-d0674dc124fa")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for string property 'HwCache_Classifier_level'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e4950bb7-fd05-4e01-99aa-428ca1240c30")
    public String getHwCache_Classifier_level() {
        return this.elt.getTagValue(HwCacheClassifier.MdaTypes.HWCACHE_CLASSIFIER_LEVEL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwCache_Classifier_repl_Policy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2fa7507b-900e-48d1-aab6-40c132cd9019")
    public String getHwCache_Classifier_repl_Policy() {
        return this.elt.getTagValue(HwCacheClassifier.MdaTypes.HWCACHE_CLASSIFIER_REPL_POLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwCache_Classifier_structure'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("844b4325-a003-4687-8b33-56b4fb8d8233")
    public String getHwCache_Classifier_structure() {
        return this.elt.getTagValue(HwCacheClassifier.MdaTypes.HWCACHE_CLASSIFIER_STRUCTURE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwCache_Classifier_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c0b0dc2e-84b3-49a8-a47a-e01bf042d38a")
    public String getHwCache_Classifier_type() {
        return this.elt.getTagValue(HwCacheClassifier.MdaTypes.HWCACHE_CLASSIFIER_TYPE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwCache_Classifier_writePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3373ccc2-7727-4496-bd7a-226a32e422ec")
    public String getHwCache_Classifier_writePolicy() {
        return this.elt.getTagValue(HwCacheClassifier.MdaTypes.HWCACHE_CLASSIFIER_WRITEPOLICY_TAGTYPE_ELT);
    }

    @objid ("5089a122-3aef-4068-bd31-44aaa2cf64fd")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwCache_Classifier_level'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fecbf546-97d9-4ee3-bebe-0313b820c9cc")
    public void setHwCache_Classifier_level(final String value) {
        this.elt.putTagValue(HwCacheClassifier.MdaTypes.HWCACHE_CLASSIFIER_LEVEL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwCache_Classifier_repl_Policy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("eb0fd958-7b23-422c-8adc-771fe90341a0")
    public void setHwCache_Classifier_repl_Policy(final String value) {
        this.elt.putTagValue(HwCacheClassifier.MdaTypes.HWCACHE_CLASSIFIER_REPL_POLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwCache_Classifier_structure'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0b3b43f0-826e-4525-8cff-ad9b7fde9187")
    public void setHwCache_Classifier_structure(final String value) {
        this.elt.putTagValue(HwCacheClassifier.MdaTypes.HWCACHE_CLASSIFIER_STRUCTURE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwCache_Classifier_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6704a879-cfce-4c6b-abf7-1ca97886d2a2")
    public void setHwCache_Classifier_type(final String value) {
        this.elt.putTagValue(HwCacheClassifier.MdaTypes.HWCACHE_CLASSIFIER_TYPE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwCache_Classifier_writePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c02114fe-e7f0-4d57-9d87-2ccaafa47b81")
    public void setHwCache_Classifier_writePolicy(final String value) {
        this.elt.putTagValue(HwCacheClassifier.MdaTypes.HWCACHE_CLASSIFIER_WRITEPOLICY_TAGTYPE_ELT, value);
    }

    @objid ("8956f5a7-0cbb-4232-a9e8-ddb9074e7580")
    protected HwCacheClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("528a2d73-20d3-4394-8867-cb0e288d9ed8")
    public static final class MdaTypes {
        @objid ("54677668-8fd5-4b51-b25c-4d205877a2d0")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0182430c-870e-4932-86c5-2b3dee306c28")
        public static TagType HWCACHE_CLASSIFIER_LEVEL_TAGTYPE_ELT;

        @objid ("164e6bfa-b8e9-4ebc-91c6-48bdb8dbd4f2")
        public static TagType HWCACHE_CLASSIFIER_TYPE_TAGTYPE_ELT;

        @objid ("f356b50f-52fc-47ff-8802-cef8e1fe100e")
        public static TagType HWCACHE_CLASSIFIER_STRUCTURE_TAGTYPE_ELT;

        @objid ("8fae3d2a-8691-4ac0-85fd-85165e1ca909")
        public static TagType HWCACHE_CLASSIFIER_REPL_POLICY_TAGTYPE_ELT;

        @objid ("134d6448-9bc0-4f2b-964d-be1087f84642")
        public static TagType HWCACHE_CLASSIFIER_WRITEPOLICY_TAGTYPE_ELT;

        @objid ("a9b88f73-0b66-4301-b12a-bb4982d4dc69")
        private static Stereotype MDAASSOCDEP;

        @objid ("89cefa03-9838-4803-b77b-a0e95da403f3")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ea6611ba-704d-4120-9456-c50e6ce1474d")
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
